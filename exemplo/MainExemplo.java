package exemplo;

public class MainExemplo {
    public static void main(String[] args) {

        //Não se pode instanciar uma classe abstrata
        //Classe pessoa: instanciavel
        
        Cliente cliente1 = new Cliente("Marta", "77", "02/07/2020", "PIX");
        Funcionario funcionario1 = new Funcionario("Mario", "81", "AXJ-986", "C&O", "R$ 24.987,46");

        System.out.println(cliente1.toString());
        System.out.println();
        System.out.println(funcionario1.toString());
    }
}
