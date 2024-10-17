package merida_Alvaro.Problemas02;


import java.util.Scanner;

public class Ejercicio24 {
/*
    Pregunta el nombre de dos jugadores. 
    A continuación, simula una partida de 
    tirada de dados: el primer jugador tira 
    un dado de 6 caras y saca una puntuación. 
    Luego hace lo mismo el segundo jugador. 
    Al final se indica que jugador ha ganado.
*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime el nombre del P1");
        String p1N = entrada.nextLine();
        System.out.println("Dime el nombre del P2");
        String p2N = entrada.nextLine();
        
        int dado1 = (int)(Math.random() * 6 + 1);
        int dado2 = (int)(Math.random() * 6 + 1);
        System.out.println("P1: "+dado1);
        System.out.println("P2: "+dado2);
        if (dado1 > dado2)
            System.out.println(p1N+" gana");
        else if (dado2 > dado1)
            System.out.println(p2N+" gana");
        else 
            System.out.println("empate");
    }
}
