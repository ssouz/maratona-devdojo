package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.test;

import academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroTest01 {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();

        populateList(carros);

	Carro c1 = new Carro("test","tt",222);


	System.out.println(carros);
    Carro.setVelocidadelimite(50);
    System.out.println(c1);
        


    }
    public static void populateList(List<Carro> carros){
        carros.add(new Carro("BMW","M5",295));
        carros.add(new Carro("Audi", "A4", 220));
        carros.add(new Carro("Mercedes-Benz", "C-Class", 250));
        carros.add(new Carro("Toyota", "Camry", 200));
        carros.add(new Carro("Honda", "Civic", 180));
        carros.add(new Carro("Ford", "Mustang", 310));
        carros.add(new Carro("Chevrolet", "Corvette", 350));
        carros.add(new Carro("Tesla", "Model S", 200));
        carros.add(new Carro("Volkswagen", "Golf GTI", 220));
        carros.add( new Carro("Porsche", "911 Carrera", 330));
    }
}
