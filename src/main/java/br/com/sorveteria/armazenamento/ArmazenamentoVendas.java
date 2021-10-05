package br.com.sorveteria.armazenamento;

import br.com.sorveteria.objetos.Produtos;
import java.util.ArrayList;

public class ArmazenamentoVendas {
    private static ArmazenamentoVendas instance;
    private ArrayList<Produtos> produtosVendidos;

    public static ArmazenamentoVendas getInstance(){
        if (instance==null){
            instance = new ArmazenamentoVendas();
        }
        return instance;
    }
    private ArmazenamentoVendas(){
        produtosVendidos = new ArrayList<Produtos>();
    }
    public void armazenamentoVendas(Produtos produtoVendido){
        produtosVendidos.add(produtoVendido);
    }
    public ArrayList<Produtos> produtosVendidos(){
        return produtosVendidos;
    }
}
