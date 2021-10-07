package br.com.sorveteria.busca;

import br.com.sorveteria.objetos.Produtos;

import java.util.ArrayList;
import java.util.Scanner;

public class BuscaProduto {
    public Produtos buscarProduto(ArrayList<Produtos> produtosCadastrados) {
        Scanner s = new Scanner(System.in);
        System.out.println("Produto: ");
        String tipoProduto = s.nextLine();
        System.out.println("Sabor: ");
        String saborProduto = s.nextLine();
        Produtos buscaProduto=null;
        for (int i = 0; i <produtosCadastrados.size(); i++) {
            if (produtosCadastrados.get(i).getTipo().equals(tipoProduto) && produtosCadastrados.get(i).getSabor().equals(saborProduto)){
                buscaProduto = produtosCadastrados.get(i);
            }
        }
        return buscaProduto;
    }
}
