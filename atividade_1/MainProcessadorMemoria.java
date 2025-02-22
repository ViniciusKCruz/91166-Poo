package atividade_1;

public class MainProcessadorMemoria {
        
   public static void main(String[] args) {
    Processador processador1 = new Processador("AMD", "Ryzen 5 4600G", "4.80hz");
    Memoria memoria1 = new Memoria("Asgard", "DDR4", "8GB ram");

    System.out.println(processador1.toString());
    System.out.println();
    System.out.println(memoria1.toString());
    
   }
}
