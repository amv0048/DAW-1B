
package Abstraccion.Ejercicio101;

public class Trabajadores extends Cliente {
    final int DESCUENTO = 8;
    String puesto;

    public Trabajadores(String nombre, String clave, String puesto) {
        super(nombre, clave);
        this.puesto = puesto;
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
        return super.toString()+"Trabajadores{" + "DESCUENTO=" + DESCUENTO + '}';
    }

    
    
    
    
}
