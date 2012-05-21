package br.cesjf.lp3.estoque.db;

import br.cesjf.lp3.estoque.classe.Estoque;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstoqueDAO {

    private Connection conexao;
    private PreparedStatement operacaoCadastrar;
    private PreparedStatement operacaoAtualizar;
    private PreparedStatement operacaoExcluir;
    private PreparedStatement operacaoBusca;
    private PreparedStatement operacaoListar;
    private PreparedStatement operacaoAtualizarQTDDestino;

    public EstoqueDAO() throws Exception {
        conexao = ConexaoJavaDB.getConnection();
        operacaoCadastrar = conexao.prepareStatement("INSERT INTO estoque(filial, produto, quantidade) VALUES(?, ?, ?)");
        operacaoAtualizar = conexao.prepareStatement("UPDATE estoque set quantidade = ? WHERE filial = ? AND produto = ?");
        operacaoExcluir = conexao.prepareStatement("DELETE FROM estoque WHERE filial = ? AND produto = ?");
        operacaoBusca = conexao.prepareStatement("SELECT * FROM estoque WHERE filial = ? AND produto = ?");
        operacaoListar = conexao.prepareStatement("SELECT * FROM estoque");
        //operacaoAtualizarQTDDestino = conexao.prepareStatement("UPDATE estoque SET ");
    }

    public void cadastrar(Estoque estoque) throws Exception {
        operacaoCadastrar.clearParameters();
        operacaoCadastrar.setString(1, estoque.getFilial());
        operacaoCadastrar.setString(2, estoque.getProduto());
        operacaoCadastrar.setInt(3, estoque.getQuantidade());
        operacaoCadastrar.executeUpdate();
    }

    public void atualizar(Estoque estoque) throws Exception {
        operacaoAtualizar.clearParameters();
        operacaoAtualizar.setInt(1, estoque.getQuantidade());
        operacaoAtualizar.setString(2, estoque.getFilial());
        operacaoAtualizar.setString(3, estoque.getProduto());
        operacaoAtualizar.executeUpdate();
    }

    public void excluir(Estoque estoque) throws Exception {
        operacaoExcluir.clearParameters();
        operacaoExcluir.setString(1, estoque.getFilial());
        operacaoExcluir.setString(2, estoque.getProduto());
        operacaoExcluir.executeUpdate();
    }

    public Estoque busca(Estoque estoque) throws Exception {
        operacaoBusca.clearParameters();
        operacaoBusca.setString(1, estoque.getFilial());
        operacaoBusca.setString(2, estoque.getProduto());
        ResultSet resultado = operacaoBusca.executeQuery();

        Estoque estoqueResultado = new Estoque();
        if (resultado.next()) {
            estoqueResultado.setFilial(resultado.getString("filial"));
            estoqueResultado.setProduto(resultado.getString("produto"));
            estoqueResultado.setQuantidade(resultado.getInt("quantidade"));
            return estoqueResultado;
        } else {
            return estoqueResultado = null;
        }

    }
    
    public List<Estoque> listAll() throws Exception {
        ResultSet resultados = operacaoListar.executeQuery();
        List<Estoque> reservas = new ArrayList<Estoque>();
        while (resultados.next()) {
            Estoque estoque = new Estoque();
            estoque.setFilial(resultados.getString("filial"));
            estoque.setProduto(resultados.getString("produto"));
            estoque.setQuantidade(resultados.getInt("quantidade"));
            reservas.add(estoque);
        }
        return reservas;
    }

    public void cad(Estoque estoque) throws Exception {
        Estoque est = busca(estoque);
        if (est != null) {
            atualizar(estoque);
        } else {
            cadastrar(estoque);
        }
    }
    
    public void transferir(String FilialOrigem, Estoque estoque) throws Exception{
        Estoque estD = busca(estoque);
        
        Estoque estoqueO = new Estoque();
        estoqueO.setFilial(FilialOrigem);
        estoqueO.setProduto(estoque.getProduto());
        Estoque estO = busca(estoqueO);
        if (estD != null) {
            Estoque estoqueDestino = new Estoque();
            estoqueDestino.setFilial(estoque.getFilial());
            estoqueDestino.setProduto(estoque.getProduto());
            estoqueDestino.setQuantidade(estoque.getQuantidade() + estD.getQuantidade());
            atualizar(estoqueDestino);
            
            Estoque EstoqueOrigem = new Estoque();            
            EstoqueOrigem.setFilial(FilialOrigem);
            EstoqueOrigem.setProduto(estoque.getProduto());
            EstoqueOrigem.setQuantidade(estO.getQuantidade() - estoque.getQuantidade());
            atualizar(EstoqueOrigem);            
            
        } else {
            Estoque estoqueDestino = new Estoque();
            estoqueDestino.setFilial(estoque.getFilial());
            estoqueDestino.setProduto(estoque.getProduto());
            estoqueDestino.setQuantidade(estoque.getQuantidade());
            cadastrar(estoque);
            
            Estoque EstoqueOrigem = new Estoque();            
            EstoqueOrigem.setFilial(FilialOrigem);
            EstoqueOrigem.setProduto(estoque.getProduto());
            EstoqueOrigem.setQuantidade(estO.getQuantidade() - estoque.getQuantidade());
            atualizar(EstoqueOrigem);            
        }                
    }
}
