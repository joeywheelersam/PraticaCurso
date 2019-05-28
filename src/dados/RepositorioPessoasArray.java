package dados;

import negocio.Pessoa;

public class RepositorioPessoasArray implements negocio.RepositorioPessoas {
    private final Pessoa[] pessoas;
    private int indice;
    public RepositorioPessoasArray (int tamanho) {
        indice = 0;
        pessoas = new Pessoa [tamanho];
    }
    @Override
    public Pessoa inserir (Pessoa pessoa) {
        pessoas[indice]=pessoa;
        indice=indice+1;
        return null;
    }
    @Override
    public Pessoa procurar(String numCPF) {
        Pessoa procurada = null;
        for (int i=0; i<indice; i++) {
            Pessoa aux = this.pessoas[i];
            if (aux.getCpf().equals(numCPF)) {
                procurada = aux;
            }
        }
        return procurada;
    }
    @Override
    public String remover(String numCPF) {
        for (int i=0; i<indice; i++) {
            Pessoa aux = this.pessoas[i];
            if (aux.getCpf().equals(numCPF)) {
                this.pessoas[i] = this.pessoas[indice -1];
                this.pessoas[indice -1] = null;
                indice = indice -1;
            }
        }
        return null;
    }
}