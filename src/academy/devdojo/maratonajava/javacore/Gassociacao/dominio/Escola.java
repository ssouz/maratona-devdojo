package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

import java.util.Arrays;

public class Escola {
    private String nome;

    private Professor[] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime() {
        System.out.println("escola: "+this.nome);
        if (professores == null) return;
        for (Professor professor : professores){
            System.out.println(professor.getNome());
        }

    }

}
