package interfaceAnimal;

public class MainAnimal {
    Cachorro cachorro = new Cachorro();
    Gato gato = new Gato();
    Pato pato = new Pato();
    Galo galo = new Galo();

    System.out.println(cachorro.emitirSom());
    System.out.println(cachorro.comer());
    System.out.println("=====================================");
    System.out.println(gato.emitirSom());
    System.out.println(gato.comer());
    System.out.println("=====================================");
    System.out.println(galo.emitirSom());
    System.out.println(galo.comer());
    System.out.println("=====================================");
    System.out.println(pato.emitirSom());
    System.out.println(pato.comer());
    System.out.println("=====================================");
}
