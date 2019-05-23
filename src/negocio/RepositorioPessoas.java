package negocio;

public interface RepositorioPessoas {
    Pessoa inserir(Pessoa pessoa);
    Pessoa procurar(String numCPF);
    String remover (String numCPF);
}