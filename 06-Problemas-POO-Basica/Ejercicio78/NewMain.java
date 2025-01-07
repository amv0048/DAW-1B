
package Ejercicio78;

public class NewMain {

    public static void main(String[] args) {
        Estudiante a = new Estudiante("Alvaro", "Vergassola", 3);
        a.insertarNota(5.9);
        a.insertarNota(10);
        a.insertarNota(0.75);
        System.out.println(a.mostrarNotas());
        System.out.println(a.calcularMedia());
        System.out.println(a.indicarRangos());
        System.out.println(a);
    }
}