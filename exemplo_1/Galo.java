package exemplo_1;

public class Galo implements Animal{

    @Override
    public String emitirSom() {
        return "cocorico";
    }

    @Override
    public String comer() {
        return "milho";
    }

}
