import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   
	   System.out.print("Quer cadastrar quantos pet's?");
	   int qtdPets = sc.nextInt();

	   int quantidade[] = new int[qtdPets];

	   for(int i = 1; i <= quantidade.length; i++){
	   System.out.print("Nome do pet: ");
	   String nomeDoPet = sc.next();

	   System.out.print("Idade do pet: ");
	   int idadeDoPet = sc.nextInt();

	   System.out.print("Raca do pet: ");
	   String racaDoPet = sc.next();

	   System.out.print("Porte do pet: ");
	   String porteDoPet = sc.next();

	   System.out.print("Alimentacao do pet: ");
	   String alimentacaoDoPet = sc.next();
	   

	   //Instanciando a classe Pet
	   Pet pet = new Pet(nomeDoPet, idadeDoPet, racaDoPet, porteDoPet, alimentacaoDoPet);
	    
	    // pet.NomePet();
	    // pet.Idade();
	    // pet.Raca();
	    // pet.Porte();
	    // pet.Alimentacao();
	    
	    System.out.println("Nome do pet: " + pet.getNomePet());
	    System.out.println("Idade do pet: " + pet.getIdade());
	    System.out.println("Raca do pet: " + pet.getRaca());
	    System.out.println("Porte do pet: " + pet.getPorte());
	    System.out.println("Alimentacao do pet: " + pet.getAlimentacao());
		System.out.println();
	   }
	   sc.close();
	}
}