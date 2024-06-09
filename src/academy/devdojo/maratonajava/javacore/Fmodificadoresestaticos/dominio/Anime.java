package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.dominio;

import java.util.Arrays;

public class Anime {
    private String nome;
    private static int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12};

    static {
        System.out.println("dentro do contrutor estatico");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }
    static {
    	System.out.println("dentro do contrutor 2 estatico");
    }
    
    {
    	System.out.println("dentro do contrutor 3 nao estatico");
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

    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                ", episodios=" + episodios.length +
                '}';
    }
}
