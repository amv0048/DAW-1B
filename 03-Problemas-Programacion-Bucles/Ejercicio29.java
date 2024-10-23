package Problemas_03_Bucles;
import java.util.Scanner;

public class Ejercicio29 {
/*
   Mejora el ejercicio 14 (minuto partido de futbol)
   añadiendo lo siguiente:
    • Impiden la entrada de segundos máximos (5400). 
    Si el usuario se pasa, saca un mensaje por pantalla 
    indicándolo y vuelve a pedir el número.
    • El programa no termina hasta que el usuario mete 
    un numero negativo
*/
    public static void main(String[] args) {
        // Creo e inicializo variables
        Scanner entrada = new Scanner(System.in);
        try (Scanner numsec = new Scanner(System.in)) {
            // Pido numero de segundos al usuario
            System.out.println("Indique el numero de segundos transcurridos");
            int seconds = numsec.nextInt();
            // Bucle anidado para comprobar que sea min 0
            while (seconds >= 0) {
                // Comprobar que no supere los segundos máximos
                while (seconds > 5400) {
                    System.out.println("Tas pasao macho");
                    seconds = entrada.nextInt();
                }
                // + 1 para que comience por el minuto 1
                int minutes = seconds / 60 + 1;
                System.out.println((minutes > 90 ? "Partido acabado" : "Minutos: "+minutes));
                // Para finalizar el bucle
                seconds = entrada.nextInt();
            }
        }
        entrada.close();
    }
}
