public class MainEmpresa {
    public static void main(String[] args) {
        
        Motoboy motoboy = new Motoboy("Júlio", "123-456-789-00", "17/08/1999", 1888.84, "89746512787f8sd7fs");
        Gerente gerente = new Gerente("Carla", "987-654-321-00", "14/02/1988", 5000.00);

        System.out.println(motoboy.toString());
        System.out.println();
        System.out.println(gerente.toString());
        System.out.println();
        gerente.admitir(motoboy);

    }
}
