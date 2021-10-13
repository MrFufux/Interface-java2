public class Bicicleta implements Rueda, Silla{


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

    @Override
    public void sentarse() {
        System.out.println("Me siento en la bicicleta");
    }
}
