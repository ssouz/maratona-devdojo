package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

import java.util.Arrays;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        Anime anime2 = new Anime("one piece");
        System.out.println(Arrays.toString(anime2.getEpisodios()));


    }
}
