package br.com.sorveteria;

import br.com.sorveteria.objetos.Clientes;
import br.com.sorveteria.validacao.ValidacaoClientes;
import org.junit.Assert;
import org.junit.Test;

public class ValidacaoClientesTest {
    @Test
    public void deveRetornarTrueSeOClienteFoiCadastrado(){
        Clientes novoCliente = new Clientes();
        novoCliente.setNome("Carlos");
        novoCliente.setEndereco("Av. Brasil,25");
        novoCliente.setDividas(25);
        novoCliente.setCartaoFidelidade(2);

        ValidacaoClientes validacaoClientes = new ValidacaoClientes();

        boolean clienteCadastrado = validacaoClientes.cadastrarCliente(novoCliente);

        Assert.assertTrue(clienteCadastrado);

    }
}
