package Ejercicio95;


public class Camioneta extends Coche {
    protected double carga;

    public Camioneta(double carga, double velocidad, int cc, String color, int numRuedas) {
        super(velocidad, cc, color, numRuedas);
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Camioneta{" + "carga=" + carga + '}';
    }
    
    
}
