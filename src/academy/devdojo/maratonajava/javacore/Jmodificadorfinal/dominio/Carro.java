package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double velocidadeLimite;
    public  Comprador comprador = new Comprador();


    static {
        velocidadeLimite = 250;

    }
    public  final void imprime(){
        System.out.println(this.nome);
    }
    public Comprador getComprador() {
        return comprador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
