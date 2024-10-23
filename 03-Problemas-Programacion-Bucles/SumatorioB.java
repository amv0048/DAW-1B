package Problemas_03_Bucles;
import java.util.Scanner;

public class SumatorioB {
/*
    b) Pedir una lista de numeros al 
    usuario hasta que se meta un numero
    negativo. Mostrar la suma, Mostrar
    todos los numeros metidos separados
    por espacio.
*/
    public static void main(String[] args) {
        // Creo e inicializo variables
        Scanner entrada = new Scanner(System.in);
        int numeros, suma = 0;
        String lista = "";
        
        //Pido numeros al usuario
        System.out.println("Introduce numeros");
        numeros = entrada.nextInt();
        
        // Sumo los numeros introducidos
        while (numeros >= 0){
            suma += numeros;
            // Guardo los numeros en una cadena
            lista += numeros+ " ";
            // Pido mas datos
            System.out.println("Dame otro");
            numeros = entrada.nextInt();
        }
        System.out.println("La suma total es de: "+suma);
        //Muestro la lista
        System.out.println("Lista: "+lista);
    }
}
