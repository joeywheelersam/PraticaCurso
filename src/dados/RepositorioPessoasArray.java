package dados;

import java.util.ArrayList;
import negocio.Pessoa;
import negocio.RepositorioPessoas;


public class RepositorioPessoasArray implements RepositorioPessoas {

    private static int indice;
    ArrayList<Pessoa> pessoas = new ArrayList<> ();
    
    public void cadastrarPessoas (Pessoa pessoa) {
        pessoas.add (pessoa);
    }
    public String quantidadePessoas () {
        return pessoas.size() + "";
    }
    
    
    
    @Override
    public Pessoa inserir(Pessoa pessoas) {
        return null;
    }
    @Override
    public Pessoa procurar(String numCPF) {
        return null;
    }
    @Override
    public String remover(String numCPF) {
        return null;
    }
}