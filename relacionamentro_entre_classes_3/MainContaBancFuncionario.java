package relacionamentro_entre_classes_3;

import java.util.Scanner;

public class MainContaBancFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeContaBanco, agenciaContaBanco, numeroContaBanco, tipoContaBanco, codigoFuncionario, 
        nomeFuncionario, enderecoFuncionario, telefoneFuncionario, emailFuncionario;
        double saldoContaBanco, limiteDisponivelContaBanco;

        System.out.print("Nome do banco: ");
        nomeContaBanco = sc.nextLine();
        System.out.print("Agencia do banco: ");
        agenciaContaBanco = sc.nextLine();
        System.out.print("Numero da conta: ");
        numeroContaBanco = sc.nextLine();
        System.out.print("Tipo da conta(Corrente/Poupanca): ");
        tipoContaBanco = sc.nextLine();
        System.out.print("Saldo atual da conta: ");
        saldoContaBanco = sc.nextDouble();
        sc.nextLine();
        System.out.print("Limite disponivel da conta: ");
        limiteDisponivelContaBanco = sc.nextDouble();
        sc.nextLine();
        System.out.print("===============================================");
        System.out.println();
        System.out.print("Codigo do funcionario: ");
        codigoFuncionario = sc.nextLine();
        System.out.print("Nome do funcionario: ");
        nomeFuncionario = sc.nextLine();
        System.out.print("Endereco do funcionario: ");
        enderecoFuncionario = sc.nextLine();
        System.out.print("Telefone do funcinario: ");
        telefoneFuncionario = sc.nextLine();
        System.out.print("E-mail do funcionario: ");
        emailFuncionario = sc.nextLine();
        System.out.println("=============================================");

        Funcionario funcionario = new Funcionario(codigoFuncionario, nomeFuncionario, enderecoFuncionario,
         emailFuncionario, new ContaBancaria(tipoContaBanco, agenciaContaBanco, telefoneFuncionario, emailFuncionario, saldoContaBanco, limiteDisponivelContaBanco));

        System.out.println(funcionario.toString());
    }
}
