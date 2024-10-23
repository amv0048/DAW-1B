package Problemas_03_Bucles;
import java.util.Scanner;

public class EjercicioClaseFor {
/*
    Pido al usuario dos valores: A y B
    a) Suponiendo que A y B son enteros positivos
    y A es mayor que B.
    Saca por pantalla los numeros pares entre A y B
    
    b) No des por supuesto nada sobre A y B. Asegurate TÚ
    de que se cumple esto, sino pide otros 2 valores
    
    c) Saca por pantalla los pares entre A y B en horizontal
    separados por coma(,)
    
    d) Muestra la suma y la media de los pares de A y B 
*/
    public static void main(String[] args) {
        // Creo e inicializo variables
        Scanner entrada = new Scanner(System.in);
        String listaH = "", listaV = "";
        int suma = 0, c = 0;
        double media = 0;
        System.out.println("Introduce dos numeros:");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        
        while (a < 0 || b < 0 || a < b) {
            System.out.println("ERROR. Introduce dos numeros");
            a = entrada.nextInt();
            b = entrada.nextInt();
        }
        for (int i = b; i < a; i++) {
            if (i % 2 == 0) {
                if (i < a - 2) listaH += i + ", ";
                else listaH += i + "";
                listaV += "\n" +i;
                suma += i;
                c++;
            }
        }
        media = suma / c;
        System.out.println("Lista Vertical: "+listaV);
        System.out.println("Lista Horizontal: "+listaH);
        System.out.println("La suma de todos los pares "
                + "es de: "+suma);
        System.out.println("La media de todos los pares "
                + "es de: "+media);
    }
}
