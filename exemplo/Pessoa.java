package exemplo;


//abstract significa que a classe vai servir para outras classes 
public abstract class Pessoa {
    //Atributos protegidos 
    //Somente a classes que estendem de pessoa podem usar esses atributos/ver
    
    protected String nome;
    protected String idade;

    public Pessoa (){
    }

    public  Pessoa(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }

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

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
    }

    
}
