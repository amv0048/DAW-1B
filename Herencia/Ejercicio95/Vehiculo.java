package Ejercicio95;


public class Vehiculo {
    protected String color;
    protected int numRuedas;

    public Vehiculo(String color, int numRuedas) {
        this.color = color;
        this.numRuedas = numRuedas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "color=" + color + ", numRuedas=" + numRuedas + '}';
    }

    public int getNumRuedas() {
        return numRuedas;
    }
    
    
    
    
}
