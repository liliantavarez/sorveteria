package br.com.sorveteria.vendas;

import br.com.sorveteria.armazenamento.ArmazenamentoVendas;
import br.com.sorveteria.atualizar.AtualizarCliente;
import br.com.sorveteria.atualizar.AtualizarEstoque;
import br.com.sorveteria.cadastros.CadastrarCliente;
import br.com.sorveteria.objetos.Clientes;
import br.com.sorveteria.objetos.Produtos;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistarVendas {

    public Produtos buscarProduto(ArrayList<Produtos> produtosCadastrados, String tipoProduto, String sabor) {
        Produtos buscaProduto=null;
        for (int i = 0; i <produtosCadastrados.size(); i++) {
            if (produtosCadastrados.get(i).getTipo().equals(tipoProduto) && produtosCadastrados.get(i).getSabor().equals(sabor)){
            buscaProduto = produtosCadastrados.get(i);
            }
        }
        return buscaProduto;
    }

    public Clientes buscarCliente(ArrayList<Clientes> clientesCadastrados, String clienteNome) {
        Clientes buscaCliente = null;
        for (int i = 0; i < clientesCadastrados.size(); i++) {
            if (clientesCadastrados.get(i).getNome().equals(clienteNome)){
                buscaCliente = clientesCadastrados.get(i);
            }
        }
             return  buscaCliente;
    }

    public void realizarVendas(ArrayList<Produtos> produtosCadastrados,ArrayList<Clientes> clientesCadastrados){
        Scanner s = new Scanner(System.in);
        double valor;
        Produtos buscaProduto;

        System.out.println("Cliente: ");
        String nomeCliente = s.nextLine();
        Clientes buscaCliente = buscarCliente(clientesCadastrados,nomeCliente);
        if (buscaCliente==null) {
            System.out.println("Cliente não cadastrado!");
            System.out.println("Cadastre o cliente antes");
            CadastrarCliente cadastroDoCliente = new CadastrarCliente();
            cadastroDoCliente.cadastroCliente();
        }else{
            System.out.println("Produto: ");
            String tipoProduto = s.nextLine();
            System.out.println("Sabor: ");
            String saborProduto = s.nextLine();
            buscaProduto = buscarProduto(produtosCadastrados,tipoProduto,saborProduto);
            if (buscaProduto==null) {
                System.out.println("Produto indisponivel!");
            }else{
                        System.out.println("Quantidade: ");
                        int quantidade = s.nextInt();
                        if (buscaProduto.getQuantidade()>=quantidade){
                            System.out.println("Realizar pagamento a vista(s/n)?");
                            char tipoPagamento = s.next().charAt(0);
                                valor = buscaProduto.getValorVenda()*quantidade;
                                AtualizarEstoque atualizaEstoque = new AtualizarEstoque();
                                AtualizarCliente atualizaCliente = new AtualizarCliente();
                                atualizaEstoque.atualizarEstoque(buscaProduto.getIdProduto(),quantidade);
                                atualizaCliente.atualizaPontos(buscaCliente.getIdCliente());
                                System.out.println("Venda Realizada Com Sucesso!");
                                System.out.println("Valor da compra: "+valor);
                            ArmazenamentoVendas.getInstance().armazenamentoVendas(buscaProduto);
                            if (tipoPagamento == 'n') {
                                atualizaCliente.atualizaDivida(buscaCliente.getIdCliente(),valor);
                            }
                        }else {
                            System.out.println("Numero de produtos insuficiente");
                            System.out.println("Quantidade disponivel: "+buscaProduto.getQuantidade());
                        }
                }

                }

            }

        }