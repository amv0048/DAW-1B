package Abstraccion.Ejercicio100;

import java.util.Date;
public class Bonificados extends Cliente {
     final int DESCUENTO = 5;
     Date fecha;

    public Bonificados(String nombre, String clave, Date fecha) {
        super(nombre, clave);
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Bonificados{" + "DESCUENTO=" + DESCUENTO + '}';
    }

    @Override
    public double calcularDescuento(double gastado) {
         if (gastado >= 75){
            return (75 - (75*(this.DESCUENTO/100)));
        }
        return gastado;
    }

}
