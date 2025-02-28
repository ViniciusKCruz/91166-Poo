package exemplo_2;

import java.util.Scanner;
public class MainOperacaoMatematica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numA, numB;

        Soma soma1 = new Soma();
        Subtracao subtracao1 = new Subtracao();
        Multiplicacao multiplicacao1 = new Multiplicacao();
        Divisao divisao1 = new Divisao();

        System.out.println("Valor de a:");go
        numA = sc.nextDouble();
        System.out.println("Valor de b:");
        numB = sc.nextDouble();
        System.out.println();
        System.out.println("Resultado da soma: " + soma1.calcular(numA, numB));
        System.out.println();
        System.out.println("Resultado da subtracao: " + subtracao1.calcular(numA, numB));
        System.out.println();
        System.out.println("Resultado da multiplicacao: " + multiplicacao1.calcular(numA, numB));
        System.out.println();
        System.out.println("Resultado da divisao: " + divisao1.calcular(numA, numB));
    }
}
