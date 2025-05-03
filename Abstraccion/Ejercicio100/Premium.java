package Abstraccion.Ejercicio100;

public class Premium extends Cliente {
   final int DESCUENTO = 15;
   int tarjeta;

    public Premium(String nombre, String clave, int tarjeta) {
        super(nombre, clave);
       // TODO check if tarjeta has 10 digits
        this.tarjeta = tarjeta;
    }
    
    @Override
    public double calcularDescuento(double gastado) {
        if (gastado >= 75){
            return (75 - (75*(this.DESCUENTO/100)));
        }
        return gastado;
    }

    @Override
    public String toString() {
        return super.toString()+"Premium{" 
                + "DESCUENTO=" + DESCUENTO + '}';
    }
    
    
}