import hilos.HiloR;
import hilos.HiloT;

public class Main {
  public static void main(String[] args) {
    HiloT miHilo1=new HiloT("Primer hilo");
    miHilo1.start();
    new HiloT("segundo hilo").start();
    System.out.println("Termina el hilo Main");
    new Thread(new HiloR(),"Tercer hilo").start();
    new Thread(new HiloR(),"Cuarto hilo").start();
    for(int i=0;i<10;i++){
        System.out.println("Iteracion "+i+" del hilo main");
    }
  }
}