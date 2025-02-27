public class DispositivoDeArmazenamento extends PC{
    private String capacidadeDeArmazenamento;
    private String tipoDeConexao;

    

    public DispositivoDeArmazenamento() {
    }

    public DispositivoDeArmazenamento(String marca, String modelo, String capacidadeDeArmazenamento, String tipoDeConexao) {
        super(marca, modelo);
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
        this.tipoDeConexao = tipoDeConexao;
    }

    public String getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(String capacidadeDeArmazenamento) {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public String getTipoDeConexao() {
        return tipoDeConexao;
    }

    public void setTipoDeConexao(String tipoDeConexao) {
        this.tipoDeConexao = tipoDeConexao;
    }

    @Override
    public String toString() {
        return "DispositivoDeArmazenamento [marca=" + marca + ", capacidadeDeArmazenamento=" + capacidadeDeArmazenamento
                + ", modelo=" + modelo + ", tipoDeConexao=" + tipoDeConexao + "]";
    }
    
}
