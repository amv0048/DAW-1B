package Problemas_04_Arrays;
import java.util.Scanner;

public class EjercicioClase1 {
/*
    Calcular la media de notas
    a) Pido al usuario el numero de notas que
       se van a introducir (numero positivo > 2)
       Si no lo pone correctamente, lo vuelvo a pedir
       Va pidiendo y almacenando notas
       Al final muestra la media de notas
    b) Controla que cada nota este entre 0 y 10
       Si no vuelve a pedirla
    c) Muestra todas las notas en horizontal separadas
       por espacio
*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double media = 0, suma = 0;
        int nota = 0;
        System.out.println("Numero de notas a introducir, "
                + "minimo 2, positivos");
        int numeroDeNotas = entrada.nextInt();
        
        while (numeroDeNotas < 2) {
            System.out.println("Introduce 2 notas minimo");
            numeroDeNotas = entrada.nextInt();
        }
        double listaNotas[] = new double[numeroDeNotas];
        
        for (int i = 0; i < numeroDeNotas; i++) {
            // Pido una nota
            System.out.println("Introduce una nota");
            nota = entrada.nextInt();
            // Comprueba que el numero este entre 0 y 10
            while (nota < 0 || nota > 10) {
                System.out.println("Error");
                nota = entrada.nextInt();
            }
            listaNotas[i] = nota;
            suma += nota;
        }
        media = suma / numeroDeNotas;
        System.out.println("La media es de: "+media);
        // Muestro el cada numero del array
        for (int j = 0; j < listaNotas.length; j++) {
            if (j == listaNotas.length - 1)
                System.out.print(listaNotas[j] + " ");
            else System.out.print(listaNotas[j] + ", ");
        }
    }
}
