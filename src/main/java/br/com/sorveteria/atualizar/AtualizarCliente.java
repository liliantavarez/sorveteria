package br.com.sorveteria.atualizar;

import br.com.sorveteria.armazenamento.ArmazenamentoClientes;

public class AtualizarCliente {
    public void atualizaDivida(int clienteId,double valor){
        ArmazenamentoClientes.getInstance().clientesCadastrados().get(clienteId).setDividas
                (ArmazenamentoClientes.getInstance().clientesCadastrados().get(clienteId).getDividas()+valor);
    }
    public void atualizaPontos(int clienteId){
        ArmazenamentoClientes.getInstance().clientesCadastrados().get(clienteId).setCartaoFidelidade
                (ArmazenamentoClientes.getInstance().clientesCadastrados().get(clienteId).getCartaoFidelidade()+1);
    }
}
