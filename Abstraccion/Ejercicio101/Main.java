package Abstraccion.Ejercicio101;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
            Articulo[] articulos = {
            new Articulo("Teclado", 80),
            new Articulo("Raton", 40)};
            
            Cliente c = new Premium("Valeria", "abc12", 1234567891) ;
            c.realizarCompra(new Date(), articulos);
            System.out.println(c.mostrarHistorial());
            
    }
    
    
}
