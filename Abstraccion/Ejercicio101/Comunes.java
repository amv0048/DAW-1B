package Abstraccion.Ejercicio101;

public class Comunes extends Cliente {

    public Comunes(String nombre, String clave) {
        super(nombre, clave);
    }

    @Override
    public String toString() {
        return super.toString()+"Comunes{" +'}';
    }

    @Override
    public double calcularDescuento(double gastado) {        
        return gastado;
    }
    
    
    
}
