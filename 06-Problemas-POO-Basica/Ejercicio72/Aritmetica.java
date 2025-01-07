package Ejercicio72;


public class Aritmetica {
    double a;
    double b;

    public Aritmetica(double a, double b){
        this.a = a;
        this.b = b;
    }
    
    public void suma(){
        double suma = a + b;
    }
    
    public void resta(){
        double resta = a - b;
    }
    
    public void multiplicacion(){
        double mult = a * b;
    }
    
    public void division(){
        double div = a / b;
    }
    
    public void potencia(){
        double p = Math.pow(a, b);
    }

    @Override
    public String toString() {
        return "Aritmetica{" + "a=" + a + ", b=" + b + '}';
    }
}