package br.com.sorveteria.armazenamento;
import br.com.sorveteria.objetos.Vendas;

import java.util.ArrayList;

//Padrão Singleton tem como definição garantir que uma classe tenha apenas uma instância de si mesma e que forneça um ponto global de acesso a ela;

public class ArmazenamentoVendas {
    private static ArmazenamentoVendas instance;
    private ArrayList<Vendas> produtosVendidos;

    public static ArmazenamentoVendas getInstance(){
        if (instance==null){
            instance = new ArmazenamentoVendas();
        }
        return instance;
    }
    private ArmazenamentoVendas(){
        produtosVendidos = new ArrayList<Vendas>();
    }
    public void armazenamentoVendas(Vendas produtoVendido){
        produtosVendidos.add(produtoVendido);
    }
    public ArrayList<Vendas> produtosVendidos(){
        return produtosVendidos;
    }
}
