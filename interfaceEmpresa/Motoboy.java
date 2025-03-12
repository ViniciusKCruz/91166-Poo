public class Motoboy extends Funcionario {
    private String placaMoto;

    public Motoboy(String nome, String cpf, String dataNascimento, double salarioBase, String placaMoto) {
        super(nome, cpf, dataNascimento, salarioBase);
        this.placaMoto = placaMoto;
    }

    public String getPlacaMoto() {
        return placaMoto;
    }

    public void setPlacaMoto(String placaMoto) {
        this.placaMoto = placaMoto;
    }

    @Override
    public double obterSalarioFinal() {
        return getSalarioBase();
    }

    @Override
    public String toString() {
        return super.toString() + "\n Placa da Moto: " + placaMoto;
    }
}
