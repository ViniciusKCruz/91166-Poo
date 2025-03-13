package relacionamentos_entre_classes_2;

public class Cliente {
    private String nome;
    private String idade;
    private Pet pet;

    //CONSTRUTOR
    public Cliente(String nome, String idade, Pet pet) {
        this.nome = nome;
        this.idade = idade;
        this.pet = pet;
    }

    //GETTER AND SETTER
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "nome = " + nome + ", idade = " + idade + ", pet = " + pet;
    }

}
