package br.com.sorveteria.vendas;

import br.com.sorveteria.armazenamento.ArmazenamentoVendas;
import br.com.sorveteria.atualizar.AtualizarCliente;
import br.com.sorveteria.atualizar.AtualizarEstoque;
import br.com.sorveteria.busca.BuscaCliente;
import br.com.sorveteria.busca.BuscaProduto;
import br.com.sorveteria.cadastros.CadastrarCliente;
import br.com.sorveteria.objetos.Clientes;
import br.com.sorveteria.objetos.Produtos;
import br.com.sorveteria.objetos.Vendas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class RegistarVendas {

    public void realizarVendas(ArrayList<Produtos> produtosCadastrados,ArrayList<Clientes> clientesCadastrados){
        Scanner s = new Scanner(System.in);
        double valor;
        Vendas novaVenda = new Vendas();
        Calendar c = Calendar.getInstance();
        Date dataVenda = c.getTime();

        BuscaCliente buscaCliente = new BuscaCliente();
        Clientes cliente = buscaCliente.buscarCliente(clientesCadastrados);
        if (cliente==null) {
            System.out.println("Cliente não cadastrado!");
            System.out.println("Cadastre o cliente antes");
            CadastrarCliente cadastroDoCliente = new CadastrarCliente();
            cadastroDoCliente.cadastroCliente();
        }else{
            BuscaProduto buscarProduto = new BuscaProduto();
            Produtos produto = buscarProduto.buscarProduto(produtosCadastrados);
            if (produto==null) {
                System.out.println("Produto indisponivel!");
            }else{
                System.out.println("Quantidade: ");
                int quantidade = s.nextInt();
                if (produto.getQuantidade()>=quantidade){
                    System.out.println("Realizar pagamento a vista(s/n)?");
                    char tipoPagamento = s.next().charAt(0);
                    valor = produto.getValorVenda()*quantidade;
                    AtualizarEstoque atualizaEstoque = new AtualizarEstoque();
                    AtualizarCliente atualizaCliente = new AtualizarCliente();
                    atualizaEstoque.atualizarEstoque(produto.getIdProduto(),quantidade);
                    atualizaCliente.atualizaPontos(cliente.getIdCliente());
                    System.out.println("Venda Realizada Com Sucesso!");
                    System.out.println("Valor da compra: "+valor);
                    novaVenda.setProdutoVendido(produto);
                    novaVenda.setQuantidade(quantidade);
                    novaVenda.setData(dataVenda);
                    ArmazenamentoVendas.getInstance().armazenamentoVendas(novaVenda);
                    if (tipoPagamento == 'n') {
                        atualizaCliente.atualizaDivida(cliente.getIdCliente(),valor);
                    }
                }else {
                    System.out.println("Numero de produtos insuficiente");
                    System.out.println("Quantidade disponivel: "+produto.getQuantidade());
                }
            }

        }

    }

}