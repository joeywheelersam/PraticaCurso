package negocio;

public class Aluno extends Pessoa {
    private Curso curso;
    public Aluno () {
        curso = null;
    }
    public Aluno (String nome, String cpf, int idade, Curso Curso) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.curso = Curso;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso Curso) {
        this.curso = Curso;
    }
    @Override
    public String toString() {
        return "Nome: " + getNome () + "\nCPF: " + getCpf () + "\nIdade: " + getIdade() + "\n" + getCurso();
    }
}