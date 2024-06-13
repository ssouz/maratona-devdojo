package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class Jogadortest03 {
    public static void main(String[] args) {

        Jogador jogador = new Jogador("cafu");
        Time time = new Time("brasil");

        jogador.setTime(time);
        time.setJogadores(new Jogador[]{jogador});

        System.out.println("jogardor =============");
        jogador.imprime();
        System.out.println("time =============");
        time.imprime();

    }
}
