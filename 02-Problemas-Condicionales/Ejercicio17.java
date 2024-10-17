package merida_Alvaro.Problemas02;
import java.util.Scanner;

public class Ejercicio17 {
/*
    Solicitar que el usuario introduzca una 
    clave dos veces. Mostrar un mensaje indicando 
    si las claves son iguales o si son diferentes.
*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una clave 2 veces");
        String clave1 = entrada.nextLine();
        String clave2 = entrada.nextLine();
        
        if (clave1.equals(clave2))
            System.out.println("Las claves son iguales");
        else
            System.out.println("Las claves son diferentes");
    }
}