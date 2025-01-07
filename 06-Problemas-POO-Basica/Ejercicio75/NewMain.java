package Ejercicio75;

public class NewMain {
    public static void main(String[] args) {
        Libro a = new Libro("libro1",72);
        Libro b = new Libro("libro2", 300);
        
        System.out.println(a);
        System.out.println(b);
        
        System.out.println(b.getPaginas());
    }
}