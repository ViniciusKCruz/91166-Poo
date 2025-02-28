package exemplo_2;

public class Subtracao implements OperacaoMatematica{
//private double numA, numB;

    @Override
    public Double calcular(double a, double b) {
        return a - b;        
    }

}
