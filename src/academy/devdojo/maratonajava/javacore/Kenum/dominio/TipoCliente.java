package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1),
    PESSOA_juridica(2);

    public final int OPT;
    TipoCliente(int OPT) {
        this.OPT = OPT;

    }
}
