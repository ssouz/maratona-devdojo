package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import java.util.Arrays;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;



    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }

        System.out.println("\nMedia: "+getMediaSalario());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }


    public double getMediaSalario() {
        if (salarios == null) {
            return 0;
        }
         double media = 0;

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;

       return media;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salarios=" + Arrays.toString(salarios)+
                ", Media: "+getMediaSalario() +
                '}';
    }
}
