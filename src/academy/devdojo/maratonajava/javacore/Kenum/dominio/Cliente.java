package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {

    private String nome;
    private TipoCliente tipoCliente;
    public enum TipoPagamento {
        DEBITO, CREDITO
    }
    private final TipoPagamento tipopagamento;


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +"(" + tipoCliente.opt +")"+
                ", tipopagamento=" + tipopagamento +
                '}';
    }

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipopagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipopagamento = tipopagamento;
    }
    //private String tipo;
    //public static final String PESSOA_FISICA = "PESSOA_FISICA";
    //public static final String PESSOA_juridica = "PESSOA_JURIDICA";


}
