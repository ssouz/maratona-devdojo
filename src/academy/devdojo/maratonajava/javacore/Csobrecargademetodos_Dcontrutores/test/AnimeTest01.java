package academy.devdojo.maratonajava.javacore.Csobrecargademetodos_Dcontrutores.test;

import academy.devdojo.maratonajava.javacore.Csobrecargademetodos_Dcontrutores.dominio.Anime;

import java.util.*;

public class AnimeTest01 {
    public static void main(String[] args) {

        List<Anime> test = new ArrayList<>();
        populateList(test);
        System.out.println(listBy(1,test));
        printList(test);



    }
    public static List<String> listBy(int search, List<Anime> test){
        return switch (search) {
            case 1 -> test.stream().map(Anime::getNome).toList();
            case 2 -> test.stream().map(Anime::getEstudio).toList();
            default -> null;
        };
    }
    public static void printList(List<Anime> test){
        int i = 0;
        while (i < test.size()){
            System.out.println(test.get(i));
            i++;
        }
    }
    public static void populateList(List<Anime> test){
        test.add(new Anime("Attack on Titan", "Shingeki no Kyojin", "tv","WIT studio", 75));
        test.add(new Anime("One Piece"));
        test.add(new Anime("My Hero Academia", "Boku no Hero Academia", "tv", 100));
        test.add(new Anime("Naruto", "Shonen", "tv", 220));
        test.add(new Anime("Death Note", "Mystery", "tv", 37));
        test.add(new Anime("Demon Slayer"));
        test.add(new Anime("Fullmetal Alchemist: Brotherhood", "Shonen", "tv", 64));
        test.add(new Anime("Cowboy Bebop", "Space Western", "tv", 26));
        test.add(new Anime("Sword Art Online", "Virtual Reality", "tv", 50));
        test.add(new Anime("Neon Genesis Evangelion", "Mecha","tv", "Gainax ", 26));

    }
}
