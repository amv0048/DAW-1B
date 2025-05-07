package Excepciones.Ejercicio104;

public class Main {

    public static void main(String[] args) {
        System.out.println("Programa automatico");
        try {
            throw new RuntimeException("soy una excepcion");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Programa terminado");
    }
}
