package hilos;

public class HiloT extends Thread{
  public HiloT(String nombre){
    super(nombre);
  }
  public void run(){
    for(int i=0; i<10;i++){
      System.out.println("Iteración "+i+" del "+getName());
    }
    System.out.println("Termina el hilo "+getName());
  }
}