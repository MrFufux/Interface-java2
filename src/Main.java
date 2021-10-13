public class Main {
    public static void main(String[] args) {

        Carro ferrari = new Carro();
        Bicicleta ruta = new Bicicleta();

        ruta.avanzar();
        ruta.detenerse();
        ruta.sentarse();
        System.out.println("------------------");
        ferrari.avanzar();
        ferrari.detenerse();
        ferrari.sentarse();
    }
}
