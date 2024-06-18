package academy.devdojo.maratonajava.javacore.Kenum.teste;

import academy.devdojo.maratonajava.Exemplos;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String args[]){

        Cliente cliente = new Cliente(Exemplos.getNomePessoaFisica(), TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente(Exemplos.getNomePessoaFisica(), TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente(Exemplos.getNomeEmpresa(),TipoCliente.PESSOA_FISICA);
        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println("_________________");
        Exemplos.test();






    }


}
