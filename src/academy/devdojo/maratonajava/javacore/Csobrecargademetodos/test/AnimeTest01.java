package academy.devdojo.maratonajava.javacore.Csobrecargademetodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargademetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Konosuba","isekai","tv",30);
        Anime anime2 = new Anime("naruto");
        System.out.println(anime);
        System.out.println(anime2);



    }
}
