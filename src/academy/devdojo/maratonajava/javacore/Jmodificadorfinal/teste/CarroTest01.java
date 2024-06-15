package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.teste;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Subaru;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.velocidadeLimite);
        System.out.println(carro.getComprador());

        carro.comprador.setNome("test");

        System.out.println(carro.getComprador());

        Subaru subaru = new Subaru();
        subaru.setNome("WRX");
        subaru.imprime();
    }
}
