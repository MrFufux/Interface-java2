public class Carro implements Rueda, Silla{

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

    @Override
    public void sentarse() {
        System.out.println("Me siento en el carro");
    }
}
