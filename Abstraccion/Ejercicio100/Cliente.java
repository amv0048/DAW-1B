package Abstraccion.Ejercicio100;

import java.util.Date;

public abstract class Cliente {
    String nombre, clave;
    Compra historial[];
    int numCompras;
    

    public Cliente(String nombre, String clave) {
        this.nombre = nombre;
        if (clave.length() > 5)
            this.clave = clave.substring(0, 5);
        else if (clave.length() < 1)
            this.clave = clave;
        else this.clave = clave;
        this.historial = new Compra[100];
    }

    public abstract double calcularDescuento(double gastado);
    
    
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", clave=" + clave + '}';
    }
    
    public void realizarCompra(Date fecha, Articulo articulos[]){
        double precio=0;
        for (int i = 0; i < articulos.length; i++) {
            precio += articulos[i].getPrecio();
        }
        double descuento = calcularDescuento(precio);
        double total = precio-descuento;
        Compra compra = new Compra(fecha, articulos);
        if (numCompras < historial.length)
            historial[numCompras++] = compra;
    }
    
    public String mostrarHistorial(){
        String res ="";
        for (int i = 0; i < historial.length; i++) {
            if (historial[i] != null)
                res += historial[i].imprimirTicket() + "\n";
        }
        return res;
    }
    
    public double calcularTotalGastado(){
        double total = 0;
        for (int i = 0; i < historial.length; i++) {
            total += historial[i].precioTotal;
            
        }
        return total;
    }
            
    
}
