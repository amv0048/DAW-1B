package Ejercicio90;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        
        Empleado E1 = new Empleado("Jaime");
        Directivo D1 = new Directivo("Carmelo");
        Operario OP1 = new Operario("Jose",34);
        Oficial OF1 = new Oficial("David",123);
        Tecnico T1 = new Tecnico("Rafa",986);
        System.out.println(E1);
        System.out.println(D1);
        System.out.println(OP1);
        System.out.println(OF1);
        System.out.println(T1);
    }
}
