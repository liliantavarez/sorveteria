package br.com.sorveteria.busca;

import br.com.sorveteria.objetos.Clientes;

import java.util.ArrayList;
import java.util.Scanner;

public class BuscaCliente {
    public Clientes buscarCliente(ArrayList<Clientes> clientesCadastrados) {
        Scanner s = new Scanner(System.in);

        System.out.println("Cliente: ");
        String nomeCliente = s.nextLine();
        Clientes buscaCliente = null;
        for (int i = 0; i < clientesCadastrados.size(); i++) {
            if (clientesCadastrados.get(i).getNome().equals(nomeCliente)){
                buscaCliente = clientesCadastrados.get(i);
            }
        }
        return  buscaCliente;
    }
}
