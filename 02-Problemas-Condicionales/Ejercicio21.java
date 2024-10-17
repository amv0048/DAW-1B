package merida_Alvaro.Problemas02;
import java.util.Scanner;

public class Ejercicio21 {
/*
    Realiza un algoritmo que indique si un año 
    es bisiesto o no. Un año es bisiesto si es 
    divisible entre 4 y no es divisible entre 
    100 o es divisible entre 400.
*/
    public static void main(String[] args) {
        // Pido un año al usuario
        Scanner entrada = new Scanner(System.in);
        int year = entrada.nextInt();
        
        // Compruebo que sea bisiesto
        if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0)
            System.out.println("Es bisiesto");
        else
            System.out.println("No es bisiesto");
        entrada.close();
    }
}
