package br.com.sorveteria.validacao;
import br.com.sorveteria.armazenamento.ArmazenamentoFornecedores;
import br.com.sorveteria.objetos.Fornecedores;

public class ValidacaoFornecedores {
    public boolean cadastrarFornecedor(Fornecedores novoFornecedor){
        boolean resultado = false;
        if (novoFornecedor != null && novoFornecedor.getNome()!="" && novoFornecedor.getContato()!=""){
            novoFornecedor.setIdForenecedores(ArmazenamentoFornecedores.getInstance().fornecedoresCadastrados().size());
            ArmazenamentoFornecedores.getInstance().cadastrarFornecedor(novoFornecedor);
            resultado = true;
        }
        return resultado;
    }
}
