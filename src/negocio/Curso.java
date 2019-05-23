package negocio;

public class Curso {
    String nome;
    int codigo;
    public Curso () {
        nome = null;
        codigo = 0;
    }
    public Curso (String nome, int codigo)  {
        this.nome = nome;
        this.codigo = codigo;
    }
    public String getNome () {
        return nome;
    }
    public int getCodigo () {
        return codigo;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
    public void setCodigo (int codigo) {
        this.codigo = codigo;
    }
    @Override
    public String toString () {
        return "Nome do Curso: " + getNome() + "\nCódigo: " + getCodigo() + "\n";
    }
}