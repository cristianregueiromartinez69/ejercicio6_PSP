public class Main {
    public static void main(String[] args) {

        Thread hilo = new Thread(new Hilos(1,2));
        hilo.start();
    }
}