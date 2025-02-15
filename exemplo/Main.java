package exemplo;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Marta", 30, "email@com");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("E-mail: " + pessoa.getEmail());

    }
}
