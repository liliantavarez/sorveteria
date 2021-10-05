package br.com.sorveteria.exibir;

import br.com.sorveteria.armazenamento.ArmazenamentoVendas;
import br.com.sorveteria.objetos.Produtos;

import java.util.ArrayList;

public class ExibirVendas {
    public double totalVendas(ArrayList<Produtos> produtosVendidos){
        double valorVendas=0;
        for (int i = 0; i< produtosVendidos.size();i++){
            valorVendas = produtosVendidos.get(i).getValorVenda()+valorVendas;
        }
        return valorVendas;
    }

    public void vendasRealizadas(){
        ArrayList<Produtos> lista = ArmazenamentoVendas.getInstance().produtosVendidos();

        if (lista.size() == 0) {
            System.out.println("Nenhuma venda registrada");
        }else {
            System.out.println("----------------------------------------");
            System.out.println("-----------PRODUTOS VENDIDOS------------");

            for (int i = 0; i < lista.size(); i++) {
                Produtos novo = lista.get(i);
                System.out.println("----------------------------------------");
                System.out.println("Tipo: "+novo.getTipo());
                System.out.println("Sabor: "+novo.getSabor());
                System.out.println("Valor de compra: "+novo.getValorCompra());
                System.out.println("Valor de venda: "+novo.getValorVenda());
                System.out.println("----------------------------------------");
            }
            System.out.println("----------------------------------------");
            System.out.println("Valor total de br.com.sorveteria.vendas: "+totalVendas(lista));
        }
    }
}
