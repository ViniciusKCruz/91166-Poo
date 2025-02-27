package atividade_2_otimizada;

public class Processador extends Produto {

    public Processador(String marca, String modelo, Double frequencia) {
        super(marca, modelo, frequencia);
    }

    @Override
    public String toString() {
        return "Processador" + super.toStringMarcaModeloFrequencia();
    }

}
