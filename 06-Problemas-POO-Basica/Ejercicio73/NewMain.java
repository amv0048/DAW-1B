
package Ejercicio73;

public class NewMain {

    public static void main(String[] args) {
        Persona val = new Persona("Ale", "Venezuela", 19, 'M');
        System.out.println(val.saludar());

        val.mostrarDatos();
        System.out.println(val.esMayorEdad()); 
    }

}
