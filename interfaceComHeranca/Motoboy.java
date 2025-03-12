public class Motoboy extends Funcionario {
    private String carteiraDeHabilitacao;

    public Motoboy(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase, String carteiraDeHabilitacao) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public Double getSalarioFinal() {
        return super.salarioBase;
    }

    @Override
    public String toString() {
        return "Motoboy{ \n" +
                " - nome = " + nome + "\n" +
                " - dataNascimento = " + dataNascimento + "\n" +
                " - sexo = " + sexo + "\n" +
                " - setor = " + setor + "\n" +
                " - salarioBase = " + getSalarioFinal() + "\n" +
                " - carteiraDeHabilitacao = " + carteiraDeHabilitacao + "\n" +
                '}';
    }

}
