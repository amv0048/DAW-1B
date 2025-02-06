package Ejercicio86;
import java.util.Scanner;

public class testRevolver {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Revolver a = new Revolver("Winchester", "1883", 6);
        //System.out.println(a);
        for (int i = 0; i < 5; i++) {
            System.out.println(a.disparar());
        }
        a.recargar(2);
        System.out.println(a);
        
    }
}