package Problemas_05_Matrices;

import java.util.Scanner;

public class Ejercicio62 {
    /*
        Crea un programa que cree una matriz de tamaño 
        NxM (tamaños introducido por teclado) e introduzca
        en ella los valores también a través del teclado teclado.
        A continuación deberá mostrar por pantalla cuántos 
        valores son mayores que cero, cuántos son menores que 
        cero y cuántos son igual a cero (es decir, se 
        muestran 3 números)
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int  negativos = 0, positivos = 0, ceros = 0;

        System.out.println("Introduce un numero");
        int num1 = entrada.nextInt();
        System.out.println("Introduce otro numero");
        int num2 = entrada.nextInt();

        int array[][] = new int[num1][num2];
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println("Introduce un numero para rellenar el array");
                array[i][j] = entrada.nextInt();
                if (array[i][j] < 0) negativos++;
                else if (array[i][j] > 0) positivos++;
                else if (array[i][j] == 0) ceros++;
            }
        }
        System.out.println("negativos: "+negativos);
        System.out.println("positivos: "+positivos);
        System.out.println("ceros: "+ceros);
    }    
}
