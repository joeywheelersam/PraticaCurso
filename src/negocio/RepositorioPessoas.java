package negocio;

public interface RepositorioPessoas {
    public Pessoa inserir(Pessoa pessoa);
    public Pessoa procurar(String numCPF);
    public String remover (String numCPF);
}