package academy.devdojo.maratonajava.javacore.Csobrecargademetodos_Dcontrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;


    public Anime(String nome) {

        this.nome = nome;

    }
    public Anime(String nome, String tipo, int episodios) {
        this(nome);
        this.tipo = tipo;
        this.episodios = episodioIsValid(episodios);
    }

    public Anime(String nome, String genero, String tipo, int episodios) {
        this(nome,tipo, episodios);
        this.genero = genero;


    }
    public Anime(String nome, String genero, String tipo,String estudio, int episodios) {
        this(nome, genero, tipo,episodios);
        this.estudio = estudio;


    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
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
