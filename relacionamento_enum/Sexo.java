package relacionamento_enum;

public enum Sexo {
    MASCULINO("Masculino"),
    FEMININO("Feminino"),
    TRANS("Trans");

    private String texto;

    private Sexo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    
}