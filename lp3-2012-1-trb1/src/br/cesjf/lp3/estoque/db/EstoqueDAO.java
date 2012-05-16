package br.cesjf.lp3.estoque.db;

import br.cesjf.lp3.estoque.classe.Estoque;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EstoqueDAO {

    private Connection conexao;
    private PreparedStatement operacaoCadastrar;
    private PreparedStatement operacaoAtualizar;
    private PreparedStatement operacaoExcluir;
    private PreparedStatement operacaoBusca;
    private PreparedStatement operacaoListar;

    public EstoqueDAO() throws Exception {
        conexao = ConexaoJavaDB.getConnection();
        operacaoCadastrar = conexao.prepareStatement("INSERT INTO estoque(filial, produto, quantidade) VALUES(?, ?, ?)");
        operacaoAtualizar = conexao.prepareStatement("UPDATE estoque set quantidade = ? WHERE filial = ? AND produto = ?");
        operacaoExcluir = conexao.prepareStatement("DELETE FROM estoque WHERE filial = ? AND produto = ?");
        operacaoBusca = conexao.prepareStatement("SELECT * FROM estoque WHERE filial = ? AND produto = ?");
        //operacaoListar = conexao.prepareStatement("SELECT * FROM reserva");
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

    public void cad(Estoque estoque) throws Exception {
        Estoque est = busca(estoque);
        if (est != null) {
            atualizar(estoque);
        } else {
            cadastrar(estoque);
        }
    }
}
