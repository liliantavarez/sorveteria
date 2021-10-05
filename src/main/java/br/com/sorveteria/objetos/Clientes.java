package br.com.sorveteria.objetos;

public class Clientes {

    private String nome;
    private String endereco;
    private double dividas;
    private int cartaoFidelidade;
    private int idCliente;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Clientes() {
    }

    public Clientes(String nome, String endereco, double dividas, int cartaoFidelidade) {
        this.nome = nome;
        this.endereco = endereco;
        this.dividas = dividas;
        this.cartaoFidelidade = cartaoFidelidade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public double getDividas() {
        return dividas;
    }
    public void setDividas(double dividas) {
        this.dividas = dividas;
    }
    public int getCartaoFidelidade() {
        return cartaoFidelidade;
    }
    public void setCartaoFidelidade(int cartaoFidelidade) {
        this.cartaoFidelidade = cartaoFidelidade;
    }

}
