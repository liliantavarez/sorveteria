package br.com.sorveteria.validacao;

import br.com.sorveteria.armazenamento.ArmazenamentoProdutos;
import br.com.sorveteria.objetos.Produtos;

public class ValidacaoProdutos {
    public boolean cadastrarProduto(Produtos novoProduto){
        boolean resultado = false;
        if (novoProduto!=null && novoProduto.getTipo() != "" && novoProduto.getSabor() != ""
                && novoProduto.getValorVenda() > 0 && novoProduto.getValorCompra() > 0 && novoProduto.getQuantidade() > 0){
            novoProduto.setIdProduto(ArmazenamentoProdutos.getInstance().produtosCadastrados().size());
            ArmazenamentoProdutos.getInstance().cadastrarProduto(novoProduto);
            resultado = true;
        }
        return resultado;
    }
}
