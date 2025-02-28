package exemplo_1;

public class Gato implements Animal {

    @Override
    public String emitirSom() {
        return "miau";
    }

    @Override
    public String comer() {
        return "ração de peixe";
    }

}
