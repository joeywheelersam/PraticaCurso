package negocio;

public class Professor extends Pessoa {
    double salario;
    public Professor () {
        salario = 0;
    }
    public Professor (String nome, String cpf, int idade, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.salario = salario;
    }
    public double getSalario () {
        return salario;
    }
    public void setSalario (double salario) {
        this.salario = salario;
    }
    @Override
    public String toString () {
        return "Nome: " + getNome () + "\nCPF: " + getCpf () + "\nIdade: " + getIdade() + "\nSalário: " + getSalario() + "\n";
    }
}