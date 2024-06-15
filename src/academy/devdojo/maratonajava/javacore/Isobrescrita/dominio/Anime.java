package academy.devdojo.maratonajava.javacore.Isobrescrita.dominio;

public class Anime {
    private String nome;

    public Anime(String nome) {
        this.nome = nome;
    }
    public String toString(){
       return "Anime: "+this.nome;
    }

}
