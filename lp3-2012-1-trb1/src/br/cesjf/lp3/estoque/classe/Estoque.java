/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.lp3.estoque.classe;


/**
 *
 * @author curso
 */
public class Estoque {
    private String filial, produto;
    private int quantidade;

    public Estoque(String filial, String produto, int quantidade) {
        this.filial = filial;
        this.produto = produto;
        this.quantidade = quantidade;
    }    

    public Estoque() {
        this("","",0);
    }
    
    @Override
    public String toString() {
        return String.format("Filial: %-150s\nProduto: %-150s\nQuantidade: %-10d\n",
                getFilial(), getProduto(), getQuantidade());
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

   
    
}
