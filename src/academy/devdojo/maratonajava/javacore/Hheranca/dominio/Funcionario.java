package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

import java.sql.SQLOutput;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicializacao estatico de funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicializacao de funcionario");
    }
    public Funcionario(String nome){
        super(nome);
    }
    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
    }
    public void relatorioPagamento(){
        System.out.println(this.nome +" Possui um salario de R$"+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" +  super.getNome() + '\'' +
                ", cpf='" + super.getCpf() + '\'' +
                ", endereco=" + super.getEndereco() +
                "Funcionario{" +
                "salario=" + salario +
                '}';
    }
}
