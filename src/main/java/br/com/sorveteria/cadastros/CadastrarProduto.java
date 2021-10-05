package br.com.sorveteria.cadastros;

import br.com.sorveteria.objetos.Produtos;
import br.com.sorveteria.validacao.ValidacaoProdutos;
import java.util.Scanner;

public class CadastrarProduto {
    public void cadastroProduto() {
        Produtos novoProduto = new Produtos();
        Scanner s = new Scanner(System.in);

        System.out.println("Tipo: ");
        String tipo = s.nextLine();
        System.out.println("Sabor: ");
        String sabor = s.nextLine();
        System.out.println("Valor de compra: ");
        double valorCompra = Double.parseDouble(s.next());
        System.out.println("Valor de Venda: ");
        double valorVenda = Double.parseDouble(s.next());
        System.out.println("Quantidade: ");
        int quantidade = s.nextInt();

        novoProduto.setTipo(tipo);
        novoProduto.setSabor(sabor);
        novoProduto.setValorCompra(valorCompra);
        novoProduto.setValorVenda(valorVenda);
        novoProduto.setQuantidade(quantidade);

        ValidacaoProdutos controlador = new ValidacaoProdutos();

        if (controlador.cadastrarProduto(novoProduto)) {
            System.out.println("-----CADASTRO REALIZADO COM SUCESSO-----");
        } else {
            System.out.println("-CADASTRO NÃO REALIZADO, REVISE OS DADOS-");
        }

    }

}
