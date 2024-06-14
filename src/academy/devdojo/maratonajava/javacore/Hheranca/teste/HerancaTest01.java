package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class HerancaTest01{
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        List<Pessoa> pessoas = new ArrayList<>();

        endereco.setRua("Rua 3");
        endereco.setCep("12345-123");

        populateList(pessoas);
        pessoas.get(3).setEndereco(endereco);
        System.out.println( pessoas.get(3));


        Funcionario funcionario = new Funcionario(pessoas.get(4).getNome(),pessoas.get(4).getCpf());
        funcionario.setSalario(1200);


        System.out.println(funcionario);
        funcionario.relatorioPagamento();
    }

    public static void populateList(List<Pessoa> pessoas){
        pessoas.add(new Pessoa("José", "231213-2131"));
        pessoas.add(new Pessoa("Maria", "543543-5432"));
        pessoas.add(new Pessoa("João", "987654-3210"));
        pessoas.add(new Pessoa("Ana", "123456-7890"));
        pessoas.add(new Pessoa("Pedro", "456789-0123"));
        pessoas.add(new Pessoa("Mariana", "098765-4321"));
        pessoas.add(new Pessoa("Carlos", "135792-4680"));
        pessoas.add(new Pessoa("Sofia", "246801-3579"));
        pessoas.add(new Pessoa("Luís", "369258-1470"));
        pessoas.add(new Pessoa("Carla", "579314-6028"));


    }
}
