package br.com.sorveteria;

import br.com.sorveteria.objetos.Produtos;
import br.com.sorveteria.validacao.ValidacaoProdutos;
import org.junit.Assert;
import org.junit.Test;

public class ValidacaoProdutosTest {
    @Test
    public void deveRetornarTrueSeOProdutoFoiCadastrado(){
        Produtos novoProduto = new Produtos();
        novoProduto.setIdProduto(1);
        novoProduto.setTipo("Sorvete");
        novoProduto.setSabor("Morango");
        novoProduto.setQuantidade(10);
        novoProduto.setValorCompra(2.50);
        novoProduto.setValorVenda(3.40);

        ValidacaoProdutos validacaoProdutos = new ValidacaoProdutos();

        boolean produtosCadastrados = validacaoProdutos.cadastrarProduto(novoProduto);

        Assert.assertTrue(produtosCadastrados);

    }
}
