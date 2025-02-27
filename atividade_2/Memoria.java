public class Memoria extends PC{
    private String capacidadeDeArmazenamento;
    private String frequenciaMemoria;


    
    public Memoria() {
    }

    public Memoria(String marca, String modelo, String capacidadeDeArmazenamento, String frequenciaMemoria) {
        super(marca, modelo);
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
        this.frequenciaMemoria = frequenciaMemoria;
    }

    public String getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(String capacidadeDeArmazenamento) {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public String getFrequenciaMemoria() {
        return frequenciaMemoria;
    }

    public void setFrequenciaMemoria(String frequenciaMemoria) {
        this.frequenciaMemoria = frequenciaMemoria;
    }

    @Override
    public String toString() {
        return "Memoria [marca=" + marca + ", capacidadeDeArmazenamento=" + capacidadeDeArmazenamento + ", modelo="
                + modelo + ", frequenciaMemoria=" + frequenciaMemoria + "]";
    };
    
    
}
