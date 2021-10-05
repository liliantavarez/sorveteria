package br.com.sorveteria.cadastros;

import br.com.sorveteria.objetos.Fornecedores;
import br.com.sorveteria.objetos.Produtos;
import br.com.sorveteria.validacao.ValidacaoFornecedores;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastrarFornecedor {
    public void cadastroFornecedor() {
        ArrayList<Produtos> produtosDoFornecedor = new ArrayList<>();
        Produtos cadastrarProduto = new Produtos();
        Fornecedores novoFornecedor = new Fornecedores();
        char escolha='n';
        Scanner s = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = s.nextLine();
        System.out.println("Contato: ");
        String contato = s.nextLine();
        System.out.println("-----CADASTRAR PRODUTOS DO FORNECEDOR-----");
        do {
        s.nextLine();
        System.out.println("Tipo: ");
        String tipo = s.nextLine();
        System.out.println("Sabor: ");
        String sabor = s.nextLine();
        System.out.println("Valor: ");
        double valorVenda = Double.parseDouble(s.next());

        cadastrarProduto.setTipo(tipo);
        cadastrarProduto.setSabor(sabor);
        cadastrarProduto.setValorVenda(valorVenda);
        produtosDoFornecedor.add(cadastrarProduto);
        System.out.println("Cadastrar novo produto do fornecedor?(s/n)");
        escolha = s.next().charAt(0);
        }while (escolha!='n');

        novoFornecedor.setNome(nome);
        novoFornecedor.setContato(contato);
        novoFornecedor.setProdutosDisponiveis(produtosDoFornecedor);

        ValidacaoFornecedores controlador = new ValidacaoFornecedores();
        if (controlador.cadastrarFornecedor(novoFornecedor)) {
            System.out.println("-----CADASTRO REALIZADO COM SUCESSO-----");
        } else {
            System.out.println("-CADASTRO NÃO REALIZADO, REVISE OS DADOS-");
        }
    }
}
