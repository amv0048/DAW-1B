package Ejercicio81;

public class Telefono {
    private String numero;
    private int contador;
    
   public Telefono(String numero){
       this.contador = 0;
   }
   
   public void realizarLLamada(String numero, int tiempo){
       System.out.println("Se ha llamado al numero: "+numero);
       if (tiempo >= 1)
        this.contador += tiempo;
   }
   @Override
   public String toString(){
       String res = this.numero+" -- "+ this.contador+"s";
       return res;
   }
}
