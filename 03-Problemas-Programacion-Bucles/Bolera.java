package Problemas_03_Bucles;
import java.util.Scanner;

public class Bolera {
/*
    Entrada a 8$, cambia por temporada.
    Pregunta al usuario por su edad,
    dependiendo de la edad:
    Menores de 5 no pagam
    Entre 5 y 15 no incluido descuento de 25%
    Entre 16 y 60 incluido entrada normal
    Entre 61 y 73 Pagan el 75% de la entrada
    Mayores de 73 no pagan.
*/
    public static void main(String[] args) {
        // Creo e inicializo variables
        Scanner entrada = new Scanner(System.in);
        double precio = 8.00, precioTotal = 8.00, precioTotalSumado = 0;
        int edad = 0;
        
        // Pido por pantalla los datos al usuario
        System.out.println("Cuantas personas sois?");
        int numPersonas = entrada.nextInt();
        while (numPersonas > 0) {
            System.out.println("dime tu edad");
            edad = entrada.nextInt();
            // Compruebo que tenga >= 0 años
            while (edad < 0) {
                System.out.println("me cago en tu padre como"
                        + " tu edad va a ser de "+edad+"?");
                System.out.println("Pon un numero positivo "
                   + "cara estropajo");
                edad = entrada.nextInt();
            }
            // Intervalos de 0 a 5 y mayor de 73 años (gratis)
            if (edad >= 0 && edad < 5 || edad > 73){
                precioTotal = precio - 8;
            }
            // Intervalos de 5 a 15 y 60 a 73 (25% de descuento)
            else if (edad >= 5 && edad < 15 || edad > 60 && edad <= 73) {
                precioTotal = precio - (precio * 0.25);
            }
            precioTotalSumado +=precioTotal;
            numPersonas--;
        }
        System.out.println("tu entrada es de: "+precioTotalSumado+" Euros");
        entrada.close();
    }
}
