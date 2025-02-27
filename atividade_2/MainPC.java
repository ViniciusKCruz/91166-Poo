public class MainPC {
    public static void main(String[] args) {
        Processador processador = new Processador("AMD", "Ryzen 7", "4.20hz");
        Memoria memoria = new Memoria("Asgard", "DDR4", "16gb", "3200mhz");
        DispositivoDeArmazenamento dispositivoDeArmazenamento = new DispositivoDeArmazenamento("Kingston", "SSD", "512 gb", "NVME 2.0");
        PlacaMae placaMae = new PlacaMae("AORUS", "B550M", "AM4");

        System.out.println(placaMae.toString());
        System.out.println();
        System.out.println(memoria.toString());
        System.out.println();
        System.out.println(dispositivoDeArmazenamento.toString());
        System.out.println();
        System.out.println(processador.toString());
    }
}
