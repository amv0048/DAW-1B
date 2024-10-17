package merida_Alvaro.Problemas02;
import java.util.Scanner;

public class RockPaperScissors {
/*
    Haz un piedra, papel o tijeras
*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige: piedra, papel o tijeras");
        String eleccionP1 = entrada.nextLine();
        
        System.out.println("Elige: piedra, papel o tijeras");
        String eleccionP2 = entrada.nextLine();
        
        if (!eleccionP1.equalsIgnoreCase("piedra") && !eleccionP1.equalsIgnoreCase("papel") && !eleccionP1.equalsIgnoreCase("tijeras"))
            System.out.println("error1");
        if (!eleccionP2.equalsIgnoreCase("piedra") && !eleccionP2.equalsIgnoreCase("papel") && !eleccionP2.equalsIgnoreCase("tijeras"))
            System.out.println("error2");
        
        else {
            if (eleccionP1.equals("piedra") && eleccionP2.equals("tijeras"))
                System.out.println("P1 wins");
            else if (eleccionP1.equals("tijeras") && eleccionP2.equals("piedra"))
                System.out.println("P2 wins");
            
            else if (eleccionP1.equals("papel") && eleccionP2.equals("piedra"))
                System.out.println("P1 wins");
            else if (eleccionP1.equals("piedra") && eleccionP2.equals("papel")) 
                System.out.println("P2 wins");
            
            else if (eleccionP1.equals("tijeras") && eleccionP2.equals("papel"))
                System.out.println("P1 wins");
            else if (eleccionP1.equals("papel") && eleccionP2.equals("tijeras"))
                System.out.println("P2 wins");
            else 
                System.out.println("Draw");
        }
    }
}