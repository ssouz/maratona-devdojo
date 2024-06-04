package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

import java.util.Arrays;

public class Anime {
    private String nome;
    private int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12};
    {
        System.out.println("dentro do contrutor");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }



    public Anime(String nome) {
        this.nome = nome;
    }
    public Anime(){

        System.out.println(Arrays.toString(episodios));
    }


    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
