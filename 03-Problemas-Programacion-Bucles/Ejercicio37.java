package Problemas_03_Bucles;
import java.util.Scanner;

public class Ejercicio37 {
/*
    Escribe un algoritmo que pida una lista de números 
    enteros uno a uno hasta que se introduzca el valor 0. 
    A continuación debe escribir por pantalla la posición 
    de la primera y de la última aparición del número 12 
    dentro de la lista. Ejemplo:
        Dame un número: 8
        Dame un número: 9
        Dame un número: 12
        Dame un número: 7
        Dame un número: 6
        Dame un número: 5
        Dame un número: 4
        Dame un número: 12
        Dame un número: 3
        Dame un número: 2
        Dame un número: 1
        Dame un número: 0
        Primera aparición en posición 3
        Última aparición en posición 8
        Importante: Si el número 12 no está en la lista, 
        se mostrará el valor 0 y si el número 12 aparece sólo 
        una vez, tanto la primera como la última posición 
        serán el mismo valor.
    b) Mostrar también por pantalla la lista de numeros
        introducida

*/            
    public static void main(String[] args) {
        // Creo e inicializo variables
        Scanner entrada = new Scanner(System.in);
        int num = 1, posicionActual = 0, contadorInicial = 0, contadorFinal = 0;
        String lista = "";
        
        while (num != 0) {
            System.out.print("Introduce un numero (0 para salir)");
            num = entrada.nextInt();
            posicionActual++;
            lista += num + ", ";
            
            if (num == 12) {
                // Solo si la posicion inicial es 0 guarda la posicion del 12
                if (contadorInicial == 0) contadorInicial = posicionActual;    
                contadorFinal = posicionActual;
            }
        }
        if (contadorInicial == 0) {
            System.out.println("Primera aparicion en posicion: 0");
            System.out.println("Ultima aparicion en posicion: 0");
        } 
        System.out.println("Primera aparicion en posicion: "+contadorInicial);
        System.out.println("Ultima aparicion en posicion: "+contadorFinal);
        System.out.println(lista);
    }
}