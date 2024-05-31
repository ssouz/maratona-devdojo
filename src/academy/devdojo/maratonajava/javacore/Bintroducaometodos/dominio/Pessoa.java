package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import java.util.Scanner;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {

        if(idade < 0) {
            System.out.println("idade invalida");
            return;
        }else{
            this.idade = idade;}

        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
