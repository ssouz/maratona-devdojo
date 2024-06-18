package academy.devdojo.maratonajava.javacore.Isobrescrita.teste;

import academy.devdojo.maratonajava.Exemplos;
import academy.devdojo.maratonajava.javacore.Isobrescrita.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime(Exemplos.getAnime());
        Anime anime2 = new Anime(Exemplos.getAnime());
        Anime anime3 = new Anime(Exemplos.getAnime());
        Anime anime4 = new Anime(Exemplos.getAnime());

        System.out.println(anime);
        System.out.println(anime2);
        System.out.println(anime3);
        System.out.println(anime4);
    }
}
