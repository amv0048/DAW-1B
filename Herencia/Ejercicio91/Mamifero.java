package Ejercicio91;


public class Mamifero {
    int numPatas;
    double mediaVida;

    public Mamifero(int numPatas, double mediaVida) {
        this.numPatas = numPatas;
        this.mediaVida = mediaVida;
    }
    
    public String comunicarse(){
        return "";
    }
    
    public void dormir(){
        System.out.println("8");
    }

    @Override
    public String toString() {
        return "Mamifero{" + "numPatas=" + numPatas + ", mediaVida=" + mediaVida + '}';
    }
    
}