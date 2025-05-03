package Abstraccion.Ejercicio100;

import java.util.Date;

public class Compra {
    Date fechaCompra;
    Articulo compras[];
    double precioTotal;
    boolean descuento; // T: si F: no

    public Compra(Date fecha, Articulo compras[]) {
        this.fechaCompra = fecha;
        this.compras = compras;
    }
    
    public String imprimirTicket(){
        String res = "Fecha "+ this.fechaCompra;
        res += "\nArticulos: ";
        for (int i = 0; i < compras.length; i++) {
          res += compras[i].getNombre()+ ", ";
           precioTotal += compras[i].getPrecio();
        }
        res += "\nTotal pagado: "+precioTotal+"€\n";
        res += "Descuento aplicado: " + (descuento ? "Sí" : "No");
        return res;
    }
    
}
