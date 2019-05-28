package negocio;

import dados.RepositorioPessoasArray;

public class PraticaCurso {
    public static void main(String[] args) {
        /* Teste da Classe Pessoa
        Pessoa a = new Pessoa ("Pessoa", "000.000.000-00", 0);
        System.out.println(a); */
        
        /* Teste da Classe Aluno
        Aluno b = new Aluno ("Aluno", "111.111.111-11", 1, new Curso ("Curso", 1));
        System.out.println(b); */
        
        /* Teste da Classe Curso
        Curso c = new Curso ("Curso", 2);
        System.out.println(c); */
        
        /* Teste da Classe Professor 
        Professor d = new Professor ("Professor", "222.222.222-22", 2, 2.2);
        System.out.println(d); */
        
        /* Teste da Classe Repositorio */
        RepositorioPessoasArray[] rep = new dados.RepositorioPessoasArray [10];
        Pessoa pessoa1 = new Pessoa ("Pessoa 1", "111.111.111-11", 1);
        rep.inserir (pessoa1);
        Pessoa pessoa2 = new Pessoa ("Pessoa 2", "222.222.222-22", 2);
        rep.inserir (pessoa2);
        Pessoa pessoa3 = new Pessoa ("Pessoa 3", "333.333.333-33", 3);
        rep.inserir (pessoa3);
        
        Pessoa procurada = rep.procurar ("222.222.222-22");
        System.out.println ("Nome: " + procurada.getNome());
        
        procurada = rep.procurar ("222.222.222-22");
        if (procurada== null) {
            System.out.println ("CPF não existe!");
        } else {
            rep.remove ("222.222.222-22");
            System.out.println ("CPF " + procurada.getCpf() + " removida!");
        }
    }
}