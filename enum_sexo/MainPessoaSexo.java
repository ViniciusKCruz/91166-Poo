package enum_sexo;

public class MainPessoaSexo {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Marta", Sexo.MULHER_TRANS, Estado.RIO_DE_JANEIRO);
        System.out.println(pessoa1.toString());
    }
}
