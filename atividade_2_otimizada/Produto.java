package atividade_2_otimizada;

public abstract class Produto {
    protected String marca;
    protected String modelo;
    protected double frequencia;
    protected double capacidadeDeArmazenamento;

//Para o uso de marca e modelo    
public Produto(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
}

//Para o uso de marca, modelo e frequência
public Produto(String marca, String modelo, double frequencia) {
    this.marca = marca;
    this.modelo = modelo;
    this.frequencia = frequencia;
}

//Para o uso de marca, modelo e capacidade de armazenamento
//Se atentar a ordem que o tipo (assinatura do método -> Ex: String, double, modelo) se apresenta para não dar erro
//Evitar a sobrecarga de métodos

public Produto(String marca,  double capacidadeDeArmazenamento, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
    this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
}

public Produto(String marca, String modelo, double frequencia, double capacidadeDeArmazenamento) {
    this.marca = marca;
    this.modelo = modelo;
    this.frequencia = frequencia;
    this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
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

public double getFrequencia() {
    return frequencia;
}

public void setFrequencia(double frequencia) {
    this.frequencia = frequencia;
}

public double getCapacidadeDeArmazenamento() {
    return capacidadeDeArmazenamento;
}

public void setCapacidadeDeArmazenamento(double capacidadeDeArmazenamento) {
    this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
}


//Apenas para marca e modelo
public String toStringMarcaModelo() {
    return "Produto [marca=" + marca + ", modelo=" + modelo + "]";
}

//Apenas para marca, modelo e frequencia
public String toStringMarcaModeloFrequencia() {
    return "Produto [marca=" + marca + ", modelo=" + modelo + ", frequencia=" + frequencia + "]";
}

//Apenas para marca, modelo e armazenamento
public String toStringMarcaModeloEArmazenamento() {
    return "Produto [marca=" + marca + ", modelo=" + modelo + ", capacidadeDeArmazenamento=" + capacidadeDeArmazenamento
            + "]";
}


public String toStringTodos() {
    return "Produto [marca=" + marca + ", modelo=" + modelo + ", frequencia=" + frequencia
            + ", capacidadeDeArmazenamento=" + capacidadeDeArmazenamento + "]";
}


    
}
