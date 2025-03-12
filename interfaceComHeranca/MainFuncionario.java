
public class MainFuncionario {
    public static void main(String[] args) {


        Motoboy motoboy = new Motoboy("Claudio", "17/09/98", Sexo.Masculino, Setor.OPERADORES, 1983.85, "7845687654");
        Diretor diretor = new Diretor("Carla", "14/05/93", Sexo.Feminino, Setor.RECURSOS_HUMANOS, 10000);

        System.out.println(motoboy.toString());
        System.out.println(diretor.admitir(motoboy));
        System.out.println("===========================================");
        System.out.println(diretor.toString());



    }
}
