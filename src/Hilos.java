import java.util.Random;

public class Hilos implements Runnable{

    private int numero_hilo;
    private int max_hilos;
    Random random = new Random();

    public Hilos(int numero_hilo, int max_hilos){

        this.numero_hilo = numero_hilo;
        this.max_hilos = max_hilos;
    }



    @Override
    public void run() {

        try{
            if(numero_hilo < max_hilos){
                Thread hiloHijo = new Thread(new Hilos(numero_hilo + 1,2));
                hiloHijo.start();
                hiloHijo.join();

            }

            for(int i = 0; i < 10; i++){

                System.out.println("Hilo " + numero_hilo + " procesando la instruccion: " + (i + 1) + "/10");
                Thread.sleep(random.nextInt(9000) + 1000);
            }



        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }


}
