package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.test;

import academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.dominio.Anime;

import java.util.Arrays;

public class AnimeTest01 {
    public static void main(String[] args){
        Anime anime = new Anime();
        Anime anime2 = new Anime();
        Anime anime3 = new Anime("test");
        Anime anime4 = new Anime();

        System.out.println("____________________________");
        System.out.println(anime3);
    }
}
