package br.com.sorveteria.exibir;

import br.com.sorveteria.armazenamento.ArmazenamentoFornecedores;
import br.com.sorveteria.objetos.Fornecedores;
import java.util.ArrayList;

public class ExibirFornecedores {
    public void fornecedoresCadastrados(){
        ArrayList<Fornecedores> lista = ArmazenamentoFornecedores.getInstance().fornecedoresCadastrados();

        if (lista.size() == 0) {
            System.out.println("Nenhum Fornecedor Cadastrado");
        }else {
            System.out.println("----------------------------------------");
            System.out.println("FORNECEDORES CADASTRADOS");

            for (int i = 0; i < lista.size(); i++) {
                Fornecedores novo = lista.get(i);
                System.out.println("----------------------------------------");
                System.out.println("Nome:" +novo.getNome());
                System.out.println("Contato: "+novo.getContato());
                System.out.println("----------------------------------------");
                System.out.println("---------PRODUTOS DO FORNECEDOR---------");
                for (int j = 0; j < lista.get(i).getProdutosDisponiveis().size();j++){
                System.out.println("----------------------------------------");
                System.out.println("Tipo: "+novo.getProdutosDisponiveis().get(j).getTipo());
                System.out.println("Sabor: "+novo.getProdutosDisponiveis().get(j).getSabor());
                System.out.println("Valor: "+novo.getProdutosDisponiveis().get(j).getValorVenda());
                System.out.println("----------------------------------------");
                }
            }
        }
    }

    }

