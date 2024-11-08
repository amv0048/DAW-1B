package Problemas_04_Arrays;
import java.util.Scanner;

public class Ejercicio56 {
/*
    Usando arrays: escribe un programa que pida 
    10 números naturales y a continuación, indique 
    cuál es el valor máximo de esa sucesión de números, el número
    de veces que aparece y sus respectivas posiciones. Ejemplo:
    7 10 143 10 52 143 72 10 143 7
    El valor máximo es el 143
    Aparece 3 veces en las posiciones 2,5,8
*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);     
        int array[] = new int[10];
        
        int max = -6666, min = 9999, auxMax = array[0],
                contadorMax = 0, posicion = 0;
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce un numero");
            array[i] = entrada.nextInt(); 
        }
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max){
                max = array[i];
                if (array[i] == auxMax)
                    contadorMax++;
                auxMax = array[i];
                posicion++;
            }
        }
        System.out.println("Max: "+max);
        System.out.println("Numero de veces: "+contadorMax);
        System.out.println("Posicion: "+posicion);
        
    }
}