public class Bicicleta implements Rueda{


    //Constructor por sin argumentos
    public Bicicleta(){

    }
    @Override
    public void avanzar() {
        System.out.println("La bicicleta avanza");
    }

    @Override
    public void detenerse() {
        System.out.println("La bicileta se detiene");
    }
}
