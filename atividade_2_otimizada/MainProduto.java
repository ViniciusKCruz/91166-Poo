package atividade_2_otimizada;

public class MainProduto {
    public static void main(String[] args) {
        Processador processador1 = new Processador("AMD","Ryzen 9", 4.8);

        System.out.println(processador1.toStringMarcaModeloFrequencia());
    }
}
