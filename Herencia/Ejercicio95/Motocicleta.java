package Ejercicio95;

public class Motocicleta extends Bicicleta {
    protected double velocidad;
    protected int cc;

    public Motocicleta(double velocidad, int cc, String tipo, String color, int numRuedas) {
        super(tipo, color, numRuedas);
        this.velocidad = velocidad;
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "velocidad=" + velocidad + ", cc=" + cc + '}';
    }
    
    
}
