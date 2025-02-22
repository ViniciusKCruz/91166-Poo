package atividade_1;

public class Memoria extends PcInformacoes{
    private String frequencia;

    public Memoria(String marca, String modelo, String frequencia) {
        super(marca, modelo);
        this.frequencia = frequencia;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Memoria [marca=" + marca + ", frequencia=" + frequencia + ", modelo=" + modelo + "]";
    }

}
