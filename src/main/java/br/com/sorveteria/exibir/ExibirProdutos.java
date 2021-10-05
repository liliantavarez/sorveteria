package br.com.sorveteria.exibir;

import br.com.sorveteria.armazenamento.ArmazenamentoProdutos;
import br.com.sorveteria.objetos.Produtos;
import java.util.ArrayList;

public class ExibirProdutos {
    public void produtosCadastrados(){
        ArrayList<Produtos> listaProdutos = ArmazenamentoProdutos.getInstance().produtosCadastrados();

        if (listaProdutos.size() == 0) {
            System.out.println("Nenhum Produto Cadastrado");
        }else {
            System.out.println("----------------------------------------");
            System.out.println("----------PRODUTOS CADASTRADOS----------");
            for (int i = 0; i < listaProdutos.size(); i++) {
                Produtos novo = listaProdutos.get(i);
                System.out.println("----------------------------------------");
                System.out.println("Tipo: "+novo.getTipo());
                System.out.println("Sabor: "+novo.getSabor());
                System.out.println("Valor de compra: "+novo.getValorCompra());
                System.out.println("Valor de venda: "+novo.getValorVenda());
                System.out.println("Quantidade: "+novo.getQuantidade());
                System.out.println("----------------------------------------");
            }
        }
    }
}
