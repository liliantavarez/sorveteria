package br.com.sorveteria.armazenamento;

import br.com.sorveteria.objetos.Clientes;

import java.util.ArrayList;

public class ArmazenamentoClientes {
    private static ArmazenamentoClientes instance;
    private ArrayList<Clientes> clientesCadastrados;


    public static ArmazenamentoClientes getInstance(){
        if (instance==null){
            instance = new ArmazenamentoClientes();
        }
        return instance;
    }
    private ArmazenamentoClientes(){
        clientesCadastrados = new ArrayList<Clientes>();
    }
    public void armazenamentoClientes(Clientes novoCliente){
        clientesCadastrados.add(novoCliente);
    }
    public ArrayList<Clientes> clientesCadastrados(){
        return clientesCadastrados;
    }

}
