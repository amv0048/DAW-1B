package Ejercicio95;

public class Bicicleta extends Vehiculo{
    protected String tipo;

    public Bicicleta(String tipo, String color, int numRuedas) {
        super(color, numRuedas);
        this.tipo = tipo;
    }
    
    public void tocarTimbre(){
        System.out.println("RING RING");
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "tipo=" + tipo + '}';
    }
    
    
}
