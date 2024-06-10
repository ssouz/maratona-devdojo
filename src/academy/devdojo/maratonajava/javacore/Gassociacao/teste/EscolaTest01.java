package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor Jiraya = new Professor("Jiraya");
        Professor kakashiSensei = new Professor("Kakashi Hatake");
        Professor shizukaSensei = new Professor("Shizuka Hiratsuka");
        Professor shirouSensei = new Professor("Shirou Fujimoto");

        Escola escola = new Escola("konoha",new Professor[]{kakashiSensei,Jiraya,shizukaSensei,shirouSensei});
        escola.imprime();
    }
}
