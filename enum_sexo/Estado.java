package enum_sexo;

public enum Estado {
    BAHIA("Bahia", "BA"),
    SAO_PAULO("Sao Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ");

    private String texto;
    private String sigla;

    private Estado(String texto, String sigla) {
        this.texto = texto;
        this.sigla = sigla;
    }

    public String getTexto() {
        return texto;
    }
    public String getSigla() {
        return sigla;
    }

}  