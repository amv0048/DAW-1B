package Problemas_03_Bucles;
import java.util.Scanner;

public class EjercicioClase5 {
/*
    
*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int MAX = 100;
        String lista = "";
        
        for (int i = 0; i <= MAX; i++) {
            if (i <= MAX - 1) lista += i + ", ";
            else lista += i + "";
        }
        System.out.println(lista);
    }
}
