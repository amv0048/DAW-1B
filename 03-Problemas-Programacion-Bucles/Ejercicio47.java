package Problemas_03_Bucles;
import java.util.Scanner;

public class Ejercicio47 {
/*
    Este es un juego donde el jugador compite 
    contra la máquina. Para ello:
    • El usuario comienza introduciendo un numero natural 
    positivo que representará la cantidad de bolas inicial
    que hay en una urna.
    • A continuación, la maquina decide quien empieza de forma aleatoria.
    • En cada turno, el usuario o la máquina podrán retirar 
    1,2 ó 3 bolas (es decir, eligen restar 1, 2 o 3).
    ◦ Si es el jugador, se le preguntará cuantas bolas 
    quiere sacar (hay que controlar que sean 1, 2 o 3).
    ◦ Si es la máquina, decidirá de forma aleatoria si 
    saca 1,2 o 3 bolas.
    • Los turnos se repiten de forma alternativa hasta 
    que uno de los dos retira la última bola. Quien haga eso, pierde.
    Mejora: haz que la máquina decida si quita 1, 2 o 3 bolas 
    en su turno dependiendo de las bolas que haya en la urna
    (y no de forma aleatoria).
*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Comienza el juego");
        System.out.println("Introduce un numero");
        int urna = entrada.nextInt();
        int eleccion = 0;
        int start = (int)(Math.random() * 2 + 1);
        while (urna > 0) {
            if (start == 1) {
                System.out.println("Empieza el usuario");
                System.out.println("Elige retirar 1, 2 o 3 bolas");
                eleccion = entrada.nextInt();
                while (eleccion < 1 || eleccion > 3){
                    System.out.println("Numero entre 1 y 3");
                    eleccion = entrada.nextInt();
                }
                System.out.println("El juegador retira "
                        +eleccion+" bolas");
                urna -= eleccion;
                System.out.println("Quedan "+urna+ " bolas");
                if (urna <= 1) System.out.println("La maquina gana");
                start = 2;
            }
            else if (start == 2) {
                System.out.println("Empieza la Máquina");
                if (urna <= 1) System.out.println("El jugador gana");
                else if (urna == 2) eleccion = 1;
                else if (urna == 3) eleccion = 2;
                eleccion = (int)(Math.random() * 3 + 1);
                System.out.println("La maquina retira "
                        +eleccion+ " bolas");
                urna -= eleccion;
                System.out.println("Quedan "+urna+ " bolas");
                start = 1;
            }
        }
    }
}
