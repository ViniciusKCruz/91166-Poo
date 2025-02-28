package exemplo_1;

public class Cachorro implements Animal{

    @Override
    public String emitirSom() {
        return "au au";

    }

    @Override
    public String comer() {
        return "ração de frango";
    }

    
}
