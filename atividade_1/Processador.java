package atividade_1;

public class Processador extends PcInformacoes{
    private String capacidadeDeArmazenamento;

    public Processador(String marca, String modelo, String capacidadeDeArmazenamento) {
        super(marca, modelo);
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public String getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(String capacidadeDeArmazenamento) {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    @Override
    public String toString() {
        return "Processador [marca=" + marca + ", capacidadeDeArmazenamento=" + capacidadeDeArmazenamento + ", modelo="
                + modelo + "]";
    }
    
}
