package br.cesjf.lp3.estoque.db;

import br.cesjf.lp3.estoque.classe.Estoque;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstoqueDAO {

    private Connection conexao;
    private PreparedStatement operacaoCadastrar;
    private PreparedStatement operacaoAtualizar;
    private PreparedStatement operacaoExcluir;
    private PreparedStatement operacaoBusca;
    private PreparedStatement operacaoListar;
    private PreparedStatement operacaoListarCombo;
    private PreparedStatement operacaoListarProdutos;
    private PreparedStatement operacaoListarProdutosFilial;

    public EstoqueDAO() throws Exception {
        conexao = ConexaoJavaDB.getConnection();
        operacaoCadastrar = conexao.prepareStatement("INSERT INTO estoque(filial, produto, quantidade) VALUES(?, ?, ?)");
        operacaoAtualizar = conexao.prepareStatement("UPDATE estoque set quantidade = ? WHERE filial = ? AND produto = ?");
        operacaoExcluir = conexao.prepareStatement("DELETE FROM estoque WHERE filial = ? AND produto = ?");
        operacaoBusca = conexao.prepareStatement("SELECT * FROM estoque WHERE filial = ? AND produto = ?");
        operacaoListar = conexao.prepareStatement("SELECT * FROM estoque ORDER BY filial");
        operacaoListarCombo = conexao.prepareStatement("SELECT DISTINCT(filial) FROM estoque");
        operacaoListarProdutos = conexao.prepareStatement("SELECT produto, SUM(quantidade) AS quantidade FROM estoque GROUP BY produto");
        operacaoListarProdutosFilial = conexao.prepareStatement("SELECT * FROM estoque WHERE filial = ?");
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

    public List<Estoque> listAllCombo() throws Exception {
        ResultSet resultados = operacaoListarCombo.executeQuery();
        List<Estoque> reservas = new ArrayList<Estoque>();
        while (resultados.next()) {
            Estoque estoque = new Estoque();
            estoque.setFilial(resultados.getString("filial"));
            reservas.add(estoque);
        }
        return reservas;
    }

    public List<Estoque> listAllProdutos() throws Exception {
        ResultSet resultados = operacaoListarProdutos.executeQuery();
        List<Estoque> reservas = new ArrayList<Estoque>();
        while (resultados.next()) {
            Estoque estoque = new Estoque();
            estoque.setProduto(resultados.getString("produto"));
            estoque.setQuantidade(Integer.parseInt(resultados.getString("quantidade")));
            reservas.add(estoque);
        }
        return reservas;
    }

    public List<Estoque> listProdutoFilial(String filial) throws Exception {
        operacaoListarProdutosFilial.clearParameters();
        operacaoListarProdutosFilial.setString(1, filial);
        ResultSet resultados = operacaoListarProdutosFilial.executeQuery();
        List<Estoque> reservas = new ArrayList<Estoque>();
        while (resultados.next()) {
            Estoque estoque = new Estoque();
            estoque.setFilial(filial);
            estoque.setProduto(resultados.getString("produto"));
            estoque.setQuantidade(resultados.getInt("quantidade"));
            reservas.add(estoque);
        }
        return reservas;
    }

    public void cad(Estoque estoque) throws Exception {

        try {
            conexao.setAutoCommit(false);

            Estoque est = busca(estoque);
            if (est != null) {
                atualizar(estoque);
            } else {
                cadastrar(estoque);
            }
            conexao.commit();
        } catch (SQLException e) {
            conexao.rollback();
        }
    }

    public void transferir(String FilialOrigem, Estoque estoque) throws Exception {

        try {
            conexao.setAutoCommit(false);

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
            } else {
                Estoque estoqueDestino = new Estoque();
                estoqueDestino.setFilial(estoque.getFilial());
                estoqueDestino.setProduto(estoque.getProduto());
                estoqueDestino.setQuantidade(estoque.getQuantidade());
                cadastrar(estoque);
            }
            Estoque EstoqueOrigem = new Estoque();
            EstoqueOrigem.setFilial(FilialOrigem);
            EstoqueOrigem.setProduto(estoque.getProduto());
            EstoqueOrigem.setQuantidade(estO.getQuantidade() - estoque.getQuantidade());
            atualizar(EstoqueOrigem);

            conexao.commit();

        } catch (SQLException e) {
            conexao.rollback();
        }
    }

    public void desativar(Estoque estoque, String filialDestino) throws Exception {

        try {
            conexao.setAutoCommit(false);

            Estoque estoqueD = new Estoque();
            estoqueD.setFilial(filialDestino);
            estoqueD.setProduto(estoque.getProduto());
            Estoque estD = busca(estoqueD);

            if (estD != null) {
                Estoque estoqueDestino = new Estoque();
                estoqueDestino.setFilial(filialDestino);
                estoqueDestino.setProduto(estoque.getProduto());
                estoqueDestino.setQuantidade(estoque.getQuantidade() + estD.getQuantidade());
                atualizar(estoqueDestino);
            } else {
                Estoque estoqueDestino = new Estoque();
                estoqueDestino.setFilial(filialDestino);
                estoqueDestino.setProduto(estoque.getProduto());
                estoqueDestino.setQuantidade(estoque.getQuantidade());
                cadastrar(estoqueDestino);
            }
            excluir(estoque);

            conexao.commit();

        } catch (SQLException e) {
            conexao.rollback();
        }
    }
}
