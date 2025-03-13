import java.util.Scanner;

public class MainClienteEndereco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //versão 1
        Endereco endereco1 = new Endereco("Rua A", 23, "Salvador");
        Cliente cliente = new Cliente("mARTA", 22, endereco1);

        System.out.println(cliente.toString());

        //Versão 2 - forma reduzida da versão 1
        Cliente cliente2 = new Cliente("mARTA", 22, 
        new Endereco("Rua B", 76, "Rio de Janeiro"));

        System.out.println(cliente2.toString());

    }

}