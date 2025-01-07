
package Ejercicio79;

public class NewMain {

    public static void main(String[] args) {
        ListasDeCadenas a = new ListasDeCadenas(5);
        a.aniadir("Hola");
        System.out.println(a.llena());
        System.out.println(a.vacia());
        System.out.println(a.obtener(0));
        System.out.println(a.tamanio());
    }
}