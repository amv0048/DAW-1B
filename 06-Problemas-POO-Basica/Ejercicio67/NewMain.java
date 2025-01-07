
package Ejercicio67;

public class NewMain {

    public static void main(String[] args) {
        Coche c1 = new Coche("azul", 1.8, 1.6, 5);
        
        c1.arrancar();
        c1.parar();
        c1.echarGasolina(20);
        c1.desplazarse();
        
        System.out.println(c1);
        
    }

}
