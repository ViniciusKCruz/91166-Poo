public class Cliente {
    private String nome;
    private int idade;
    private Endereco endereco; //Relacionamento entre classes - endereco cliente puxa a classe endereco
    
    //Construtor
    public Cliente(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    //GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + "]";
    }
    
    

}
