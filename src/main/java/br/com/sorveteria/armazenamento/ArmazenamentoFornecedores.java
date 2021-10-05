package br.com.sorveteria.armazenamento;

import br.com.sorveteria.objetos.Fornecedores;

import java.util.ArrayList;

public class ArmazenamentoFornecedores {
    private static ArmazenamentoFornecedores instance;
    private ArrayList<Fornecedores> fornecedoresCadastrados;

    private ArmazenamentoFornecedores(){
        fornecedoresCadastrados = new ArrayList<Fornecedores>();
    }

    public static ArmazenamentoFornecedores getInstance(){
        if (instance==null){
            instance = new ArmazenamentoFornecedores();
        }
        return instance;
    }

    public void cadastrarFornecedor(Fornecedores novoFornecedor){
        fornecedoresCadastrados.add(novoFornecedor);
    }
    public ArrayList<Fornecedores> fornecedoresCadastrados(){
        return fornecedoresCadastrados;
    }


}
