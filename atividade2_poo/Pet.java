import java.util.Scanner;

public class Pet {
    Scanner sc = new Scanner(System.in);
    private String nomePet;
    private int idade;
    private String raca;
    private String porte; 
    private String alimentacao;
    
    
    //Construtores
    public Pet(String nomePet, int idade, String raca, String porte, String alimentacao){
        this.nomePet = nomePet;
        this.idade = idade;
        this.raca = raca;
        this.porte = porte;
        this.alimentacao = alimentacao;
    }
    
    //Métodos Get
    public String getNomePet(){
        return nomePet;
    }
    public int getIdade(){
        return idade;
    }
    public String getRaca(){
        return raca;
    }
    public String getPorte(){
        return porte;
    }
    public String getAlimentacao(){
        return alimentacao;
    }
    
    //Métodos Set
    public void setNomePet(String nomePet){
        this.nomePet = nomePet ;
    }
    public void setIdade(int idade){
        this.idade = idade ;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }
    public void setPorte(String porte){
        this.porte = porte;
    }
    public void setAlimentacao(String alimentacao){
        this.alimentacao = alimentacao;
    }
    
    // public String NomePet(){
    //     System.out.print("Insira o nome do seu pet: ");
    //     this.nomePet = sc.nextLine();
    //     return nomePet;
    // }
    
    // public int Idade(){
    //     System.out.print("Insira a idade do seu pet: ");
    //     this.idade = sc.nextInt();
    //     return idade;
    // }
    
    // public String Raca(){
    //     System.out.print("Insira a raca do seu pet: ");
    //     this.raca = sc.nextLine();
    //     return raca;
    // }
    
    // public String Porte(){
    //     System.out.print("Insira o porte do seu pet: ");
    //     this.porte = sc.nextLine();
    //     return raca;
    // }
    
    // public String Alimentacao(){
    //     System.out.print("Insira a raca do seu pet: ");
    //     this.alimentacao = sc.nextLine();
    //     return alimentacao;
    // }
}