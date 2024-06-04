package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.dominio;

public class Carro {
    private String fabricante;
    private String modelo;

    private double velocidadeMaxima;
    private static double velocidadelimite = 280;

    public static void setVelocidadelimite(double velocidadelimite) {
        Carro.velocidadelimite = velocidadelimite;
    }

    public Carro(String fabricante, String modelo, double velocidadeMaxima) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
    }


    @Override
    public String toString() {
        return "\nCarro{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", velocidadelimite=" + velocidadelimite +
                '}';
    }
}
