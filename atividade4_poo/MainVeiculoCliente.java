package atividade4_poo;

import java.util.Scanner;

public class MainVeiculoCliente {
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


        String nomeCliente;
        int idadeCliente;
        String cpfCliente;
        String enderecoCliente;
        String telefoneCliente;
    
        System.out.print("Digite seu nome: ");
        nomeCliente = sc.nextLine();
        System.out.print("Digite sua Idade:");
        idadeCliente = sc.nextInt();
        System.out.print("Digite seu CPF:");
        cpfCliente = sc.next();
        sc.nextLine();
        System.out.print("Digite seu Endereco:");
        enderecoCliente = sc.nextLine();
        System.out.print("Digite seu Telefone:");
        telefoneCliente = sc.next();

        Cliente cliente = new Cliente(nomeCliente, idadeCliente, cpfCliente, enderecoCliente, telefoneCliente);

        System.out.println("===========================================");
        System.out.println("Nome:" + cliente.getNome());
        System.out.println("Idade:" + cliente.getIdade());
        System.out.println("CPF:" + cliente.getCpf());
        System.out.println("Endereco:" + cliente.getEndereco());
        System.out.println("Telefone:" + cliente.getTelefone());
        System.out.println("===========================================");
    }

}
