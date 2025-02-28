package exemplo_2;

public class Soma implements OperacaoMatematica{
    //private double numA;
    //private double numB;

    @Override
    public Double calcular(double a, double b) {
        return a + b;
    }

}
