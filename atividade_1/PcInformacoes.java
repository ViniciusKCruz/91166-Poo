package atividade_1;

public abstract class PcInformacoes {
    protected String marca;
    protected String modelo;
    
    public PcInformacoes() {
    }

    public PcInformacoes(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "PcInformacoes [marca = " + marca + ", modelo =" + modelo + "]";
    }

    
}
