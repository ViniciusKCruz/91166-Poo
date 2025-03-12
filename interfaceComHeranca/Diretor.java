public class Diretor extends Funcionario implements Contratacao{
    private static final double PREMIO = 0.2;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }

    @Override
    public Double getSalarioFinal() {
        return super.salarioBase + (super.salarioBase * PREMIO);
    }

    @Override
    public String toString() {
        return "Diretor{" +
                " - nome = " + nome + "\n" +
                " - dataNascimento = " + dataNascimento + "\n" +
                " - sexo = " + sexo + "\n" +
                " - setor = " + setor + "\n" +
                " - salario final =" + getSalarioFinal() + "\n" +
                '}';
    }
    @Override
    public void admitir(Funcionario funcionario) {
        System.out.printf("Admitido(a)" + funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.printf("Demitido(a)" + funcionario.toString());
    }
}
