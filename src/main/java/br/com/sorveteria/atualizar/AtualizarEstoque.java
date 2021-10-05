package br.com.sorveteria.atualizar;

import br.com.sorveteria.armazenamento.ArmazenamentoProdutos;

public class AtualizarEstoque {
    public void atualizarEstoque(int produtoId,int quantidade){
       ArmazenamentoProdutos.getInstance().produtosCadastrados().get(produtoId).setQuantidade
         (ArmazenamentoProdutos.getInstance().produtosCadastrados().get(produtoId).getQuantidade()-quantidade);
    }
}
