public class Carro implements Rueda{

    //Constructor por sin argumentos
    public Carro(){

    }

    @Override
    public void avanzar() {
        System.out.println("El carro avanza");

    }

    @Override
    public void detenerse() {
        System.out.println("El carro se detiene");

    }
}
