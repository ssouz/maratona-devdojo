package academy.devdojo.maratonajava.javacore.Csobrecargademetodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public Anime(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodioIsValid(episodios);
    }

    public Anime(String nome, String genero, String tipo, int episodios) {
        this.nome = nome;
        this.genero = genero;
        this.tipo = tipo;
        this.episodios = episodios;

    }

    public Anime(String nome) {
        this.nome = nome;
    }

    private int episodioIsValid(int episodios) {
        return Math.max(episodios, 0);
    }


    @Override
    public String toString() {
        if(tipo == null && episodios == 0){
            return "Anime{" +
                    "nome='" + nome + '\'' +
                    '}';
        }else{
            return "Anime{" +
                    "nome='" + nome + '\'' +
                    ", genero='" + genero + '\'' +
                    ", tipo='" + tipo + '\'' +
                    ", episodios=" + episodios +
                    '}';
        }
    }

}
