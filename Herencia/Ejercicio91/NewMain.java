package Ejercicio91;

public class NewMain {

    public static void main(String[] args) {
        
        Perro cupcake = new Perro(4, 16, "Golden", "Cupcake");
        Gato valentino = new Gato(4, 20, "siames", "valentino");
        
        System.out.println(cupcake);
        System.out.println(valentino);
        
        System.out.println(cupcake.comunicarse());
        System.out.println(valentino.comunicarse());
    }
}