package enum_sexo;

public class Pessoa {
    private String nome;
    private Sexo sexo;
    private Estado uf;


    public Pessoa() {
    }

    

public Pessoa(String nome, Sexo sexo, Estado uf) {
        this.nome = nome;
        this.sexo = sexo;
        this.uf = uf;
    }



public String getNome() {
    return nome;
}


public void setNome(String nome) {
    this.nome = nome;
}


public Sexo getSexo() {
    return sexo;
}


public void setSexo(Sexo sexo) {
    this.sexo = sexo;
}

public Estado getUf() {
    return uf;
}

public void setUf(Estado uf) {
    this.uf = uf;
}

@Override
public String toString() {
    return "Pessoa\n nome = " + nome + ", sexo = " + sexo + ", uf = " + uf;
}

}
