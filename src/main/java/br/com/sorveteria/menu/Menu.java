package br.com.sorveteria.menu;

import br.com.sorveteria.armazenamento.ArmazenamentoClientes;
import br.com.sorveteria.armazenamento.ArmazenamentoProdutos;
import br.com.sorveteria.cadastros.CadastrarCliente;
import br.com.sorveteria.cadastros.CadastrarFornecedor;
import br.com.sorveteria.cadastros.CadastrarProduto;
import br.com.sorveteria.exibir.ExibirClientes;
import br.com.sorveteria.exibir.ExibirFornecedores;
import br.com.sorveteria.exibir.ExibirProdutos;
import br.com.sorveteria.exibir.ExibirVendas;
import br.com.sorveteria.objetos.Clientes;
import br.com.sorveteria.objetos.Produtos;
import br.com.sorveteria.vendas.RegistarVendas;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private int escolha=-1;
    Scanner s = new Scanner(System.in);
    public void menu(){
        do {
            System.out.println("----------------------------------------");
            System.out.println("------------BARRACA DA BICHA------------");
            System.out.println("----------------------------------------");
            System.out.println("1.Cadastrar Clientes");
            System.out.println("2.Ver Clientes Cadastrados");
            System.out.println("3.Cadastrar Fornecedor");
            System.out.println("4.Ver Fornecedores");
            System.out.println("5.Cadastrar Produtos");
            System.out.println("6.Produtos Em Estoque");
            System.out.println("7.Realizar Vendas");
            System.out.println("8.Vendas Realizadas");
            System.out.println("0.Sair");
            escolha = s.nextInt();
            switch (escolha){
                case 1:
                    CadastrarCliente cadastroDoCliente = new CadastrarCliente();
                    cadastroDoCliente.cadastroCliente();
                    break;
                case 2:
                    ExibirClientes exibirClientes = new ExibirClientes();
                    exibirClientes.clientesCadastrados();
                    break;
                case 3:
                    CadastrarFornecedor cadastroDeFornecedor = new CadastrarFornecedor();
                    cadastroDeFornecedor.cadastroFornecedor();
                    break;
                case 4:
                    ExibirFornecedores exibirFornecedores = new ExibirFornecedores();
                    exibirFornecedores.fornecedoresCadastrados();
                    break;
                case 5:
                    CadastrarProduto cadastrarProduto = new CadastrarProduto();
                    cadastrarProduto.cadastroProduto();
                    break;
                case 6:
                    ExibirProdutos exibirProdutos = new ExibirProdutos();
                    exibirProdutos.produtosCadastrados();
                    break;
                case 7:
                    ArrayList<Clientes> clientesCadastrados = ArmazenamentoClientes.getInstance().clientesCadastrados();
                    ArrayList<Produtos> listaProdutos = ArmazenamentoProdutos.getInstance().produtosCadastrados();
                    RegistarVendas registarVendas = new RegistarVendas();
                    registarVendas.realizarVendas(listaProdutos,clientesCadastrados);
                    break;
                case 8:
                    ExibirVendas exibirVendas = new ExibirVendas();
                    exibirVendas.vendasRealizadas();
                    break;
                default:
                    System.out.println("Opção Invalida!");
            }

        }while (escolha!=0);
    }

}
