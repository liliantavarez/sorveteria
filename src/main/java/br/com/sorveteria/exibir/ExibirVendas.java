package br.com.sorveteria.exibir;

import br.com.sorveteria.armazenamento.ArmazenamentoVendas;
import br.com.sorveteria.objetos.Produtos;
import br.com.sorveteria.objetos.Vendas;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Locale;

public class ExibirVendas {
    public double totalVendas(ArrayList<Produtos> produtosVendidos){
        double valorVendas=0;
        for (int i = 0; i< produtosVendidos.size();i++){
            valorVendas = produtosVendidos.get(i).getValorVenda()+valorVendas;
        }
        return valorVendas;
    }

    public void vendasRealizadas(){
        ArrayList<Vendas> lista = ArmazenamentoVendas.getInstance().produtosVendidos();
        Locale brasil = new Locale("pt", "BR"); //Retorna do país e a língua

        DateFormat dataBr = DateFormat.getDateInstance(DateFormat.FULL, brasil);

        if (lista.size() == 0) {
            System.out.println("Nenhuma venda registrada");
        }else {
            System.out.println("----------------------------------------");
            System.out.println("-----------PRODUTOS VENDIDOS------------");

            for (int i = 0; i < lista.size(); i++) {
                Vendas novo = lista.get(i);
                System.out.println("----------------------------------------");
                System.out.println(dataBr.format(novo.getData()));
                System.out.println("Tipo: "+novo.getProdutoVendido().getTipo());
                System.out.println("Sabor: "+novo.getProdutoVendido().getSabor());
                System.out.println("Quantidade: "+novo.getQuantidade());
                System.out.println("Valor: "+novo.getQuantidade()*novo.getProdutoVendido().getValorVenda());
                System.out.println("----------------------------------------");
            }
        }
    }
}
