package Ejercicio95;


public class Coche extends Vehiculo{
    protected double velocidad;
    protected int cc;

    public Coche(double velocidad, int cc, 
            String color, int numRuedas) {
        super(color, numRuedas);
        this.velocidad = velocidad;
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Coche{" + "velocidad=" + velocidad + ", cc=" + cc + '}';
    }
    
    
}
