package atividades3_poo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String placaVeiculo;
        String corVeiculo;
        int qtdPassageiros;
        double capacidadeTanqueVeiculo;
        double velocidadeMaximaVeiculo;
        double consumoMedioVeiculo;

        System.out.println("Placa do veiculo:");
        placaVeiculo = sc.next();
        System.out.println("Cor do veiculo:");
        corVeiculo = sc.next();
        System.out.println("Suporta quantos passageiros?");
        qtdPassageiros = sc.nextInt();
        System.out.println("Capacidade maxima do tanque:");
        capacidadeTanqueVeiculo = sc.nextDouble();
        System.out.println("Velocidade maxima que o veiculo pode chegar?");
        velocidadeMaximaVeiculo = sc.nextDouble();
        System.out.println("Consumo medio do veiculo:");
        consumoMedioVeiculo = sc.nextDouble();
        sc.nextLine();

        Veiculo veiculo = new Veiculo(placaVeiculo, corVeiculo, qtdPassageiros, capacidadeTanqueVeiculo, velocidadeMaximaVeiculo, consumoMedioVeiculo);

        System.out.println("===========================================");
        System.out.println("INFORMACOES DO VEICULO:");
        System.out.println("PLACA: " + veiculo.getPlaca());
        System.out.println("COR: " + veiculo.getCor());
        System.out.println("QUANTIDADE DE PASSAGEIROS: " + veiculo.getNumeroDePassageiros());
        System.out.println("CAPACIDADE DO TANQUE: " + veiculo.getCapacidadeDeTanque());
        System.out.println("VELOCIDADE MAXIMA: " + veiculo.getVelocidadeMaxima());
        System.out.println("CONSUMO MEDIO: " + veiculo.getConsumoMedio());
        System.out.println("===========================================");


        String tituloLivro;
        String autorLivro;
        String ibsnLivro;
        int numeroDePaginasLivro;
        double valorDeCompraLivro;

        System.out.println("Titulo do livro: ");
        tituloLivro = sc.nextLine();
        System.out.println("Autor do livro: ");
        autorLivro = sc.next();
        sc.nextLine();
        System.out.println("Ibsn no livro: ");
        ibsnLivro = sc.next();
        System.out.println("Quantidade de paginas: ");
        numeroDePaginasLivro = sc.nextInt();
        System.out.println("Valor do livro: ");
        valorDeCompraLivro = sc.nextDouble();

        Livro livro = new Livro(tituloLivro, autorLivro, numeroDePaginasLivro, valorDeCompraLivro, ibsnLivro);

        System.out.println("===========================================");
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Quantidade: " + livro.getNumeroDePaginas());
        System.out.println("Preco: " + livro.getPreco());
        System.out.println("IBSN: " + livro.getIbsnDoLivro());
        System.out.println("===========================================");
    }
}
