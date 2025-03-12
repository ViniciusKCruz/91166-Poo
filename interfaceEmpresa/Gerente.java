public class Gerente extends CargoDeConfianca implements Contratacao{
    
    public Gerente(String nome, String cpf, String dataNascimento, double salarioBase){
        super(nome, cpf, dataNascimento, salarioBase, Bonificacao.GERENTE);
    }

    @Override
    public double obterSalarioFinal(){
        return salarioBase * bonificacao.getValor();
    }

    @Override
    public void admitir(Funcionario funcionario){
        System.out.println("Gerente contratando: " + funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario){
        System.out.println("Gerente demitindo: " + funcionario.toString());
    }

    @Override
    public String toString(){
        return super.toString() + "\n" +
        "Bonificacao: " + super.getBonificacao().getValor();
    }
}
