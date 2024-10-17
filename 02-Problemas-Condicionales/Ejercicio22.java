package merida_Alvaro.Problemas02;
import java.util.Scanner;
/*
    Necesitamos realizar un algoritmo 
    que dados un mes (número del 1 al 12) 
    y un año introducidos por el usuario, 
    indique si ese mes tiene 31, 30, 29 o 
    28 días. Recuerda que en los años bisiestos,
    Febrero tiene 29 días y no 28.
*/
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pido el mes y año al usuario
        System.out.print("Introduce el mes (1-12): ");
        int mes = scanner.nextInt();
        System.out.print("Introduce el año: ");
        int año = scanner.nextInt();

        // Compruebo el mes
        if (mes < 1 || mes >= 12)
            System.out.println("Mes inválido. Debe estar entre 1 y 12.");
        else {
            // Determinar los días por mes
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
                System.out.println("El mes tiene 31 días.");
            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
                System.out.println("El mes tiene 30 días.");
            else if (mes == 2) { // Febrero
                // Comprobación de año bisiesto
                if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                    System.out.println("Febrero tiene 29 días, año bisiesto.");
                } 
                else {
                    System.out.println("Febrero tiene 28 días.");
                }
            }
        }
        scanner.close();
    }
}