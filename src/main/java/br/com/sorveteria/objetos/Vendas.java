package br.com.sorveteria.objetos;

import java.util.Date;

public class Vendas {
    private int idVendas;
    private Produtos produtoVendido;
    private int quantidade;
    private Date data;

    public Vendas(Produtos produtoVendido, int quantidade, Date data) {
        this.produtoVendido = produtoVendido;
        this.quantidade = quantidade;
        this.data = data;
    }

    public Produtos getProdutoVendido() {
        return produtoVendido;
    }

    public void setProdutoVendido(Produtos produtoVendido) {
        this.produtoVendido = produtoVendido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Vendas() {
    }

}
