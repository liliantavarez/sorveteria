package br.com.sorveteria.cadastros;
import br.com.sorveteria.objetos.Clientes;
import br.com.sorveteria.validacao.ValidacaoClientes;

import java.util.Scanner;

public class CadastrarCliente{

        public void cadastroCliente() {
            Scanner s = new Scanner(System.in);

            Clientes novoCliente = new Clientes();
            System.out.println("Nome: ");
            String nome = s.nextLine();
            System.out.println("Endereço: ");
            String endereco = s.nextLine();
            System.out.println("Divida: ");
            double divida = Double.parseDouble(s.next());
            System.out.println("Pontos de Fidelidade: ");
            int pontos = s.nextInt();
            s.nextLine();

            novoCliente.setNome(nome);
            novoCliente.setEndereco(endereco);
            novoCliente.setDividas(divida);
            novoCliente.setCartaoFidelidade(pontos);


            ValidacaoClientes controlador = new ValidacaoClientes();

            if (controlador.cadastrarCliente(novoCliente)) {
                System.out.println("-----CADASTRO REALIZADO COM SUCESSO-----");
            } else {
                System.out.println("-CADASTRO NÃO REALIZADO, REVISE OS DADOS-");
            }
        }

}
