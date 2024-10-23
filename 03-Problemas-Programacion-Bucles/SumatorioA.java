package Problemas_03_Bucles;
import java.util.Scanner;

public class SumatorioA {
/*
    a) Programa que pida al usuario un tope
    y calcule el sumatorio del 1 al tope
    Solo se admiten numeros mayores a 2
    si eso no ocurre se vuelve a pedir el
    numero.
    
    b) Pedir una lista de numeros al 
    usuario hasta que se meta un numero
    negativo. Mostrar la suma, Mostrar
    todos los numeros metidos separados
    por espacio.
*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = 0, suma;
        System.out.println("Introduce un numero mayor de 2");
        num = entrada.nextInt();
        
        // Aseguro que sea mayor de 2
        while (num <= 2) {
            System.out.println("MAYOR que 2 pechofrio");
            num = entrada.nextInt();
        }
        suma = num;
        while (suma > 0){
            num += suma - 1;
            suma--;
            System.out.println(suma);
        }
        System.out.println(num);
    }
}
