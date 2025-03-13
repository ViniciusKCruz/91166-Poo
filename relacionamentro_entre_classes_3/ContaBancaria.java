package relacionamentro_entre_classes_3;

public class ContaBancaria {
    private String banco;
    private String agencia;
    private String numeroDaConta;
    private String tipoDaConta;
    private double saldoAtual;
    private double limiteDisponivel;

    //Construct
    public ContaBancaria(String banco, String agencia, String numeroDaConta, String tipoDaConta, double saldoAtual,
            double limiteDisponivel) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroDaConta = numeroDaConta;
        this.tipoDaConta = tipoDaConta;
        this.saldoAtual = saldoAtual;
        this.limiteDisponivel = limiteDisponivel;
    }

    //GET AND SET
    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTipoDaConta() {
        return tipoDaConta;
    }

    public void setTipoDaConta(String tipoDaConta) {
        this.tipoDaConta = tipoDaConta;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    @Override
    public String toString() {
        return "Funcionario [banco=" + banco + ", agencia=" + agencia + ", numeroDaConta=" + numeroDaConta
                + ", tipoDaConta=" + tipoDaConta + ", saldoAtual=" + saldoAtual + ", limiteDisponivel="
                + limiteDisponivel + "]";
    }
}
