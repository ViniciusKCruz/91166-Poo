package relacionamentos_entre_classes_2;

import java.util.Scanner;

public class MainClientePet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeCliente, nomePet, idadeCliente, idadePet, racaPet;

        System.out.print("Nome do cliente: ");
        nomeCliente = sc.nextLine();
        System.out.print("Idade do cliente: ");
        idadeCliente = sc.nextLine();
        System.out.print("Nome do pet: ");
        nomePet = sc.nextLine();
        System.out.print("Idade do pet: ");
        idadePet = sc.nextLine();
        System.out.print("Raca do pet: ");
        racaPet = sc.nextLine();
        
        Cliente cliente1 = new Cliente(nomeCliente, idadeCliente, 
        new Pet(nomePet, idadePet, racaPet));

        System.out.println(cliente1.toString());

    }
}
