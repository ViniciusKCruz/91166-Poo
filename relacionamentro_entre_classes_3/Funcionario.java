package relacionamentro_entre_classes_3;

public class Funcionario {
    private String codigoFuncionario;
    private String nome;
    private String endereco;
    private String email;
    private ContaBancaria contaBanco;

    //Construct
    public Funcionario(String codigoFuncionario, String nome, String endereco, String email, ContaBancaria contaBanco) {
        this.codigoFuncionario = codigoFuncionario;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.contaBanco = contaBanco;
    }

    //GET AND SET
    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContaBancaria getContaBanco() {
        return contaBanco;
    }

    public void setContaBanco(ContaBancaria contaBanco) {
        this.contaBanco = contaBanco;
    }

    @Override
    public String toString() {
        return "Funcionario [codigoFuncionario=" + codigoFuncionario + ", nome=" + nome + ", endereco=" + endereco
                + ", email=" + email + ", contaBanco=" + contaBanco + "]";
    }
    
}
