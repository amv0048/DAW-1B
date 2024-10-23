package Problemas_03_Bucles;
import java.util.Scanner;

public class EjercicioClase4 {
/*
    Pido al usuario que meta el nick
    y clave hasta que ambos sean correctos
    o pase de 3 intentos.
    nick: mancos
    clave: 1234
*/
    public static void main(String[] args) {
        // Creo e inicalizo las variables
        Scanner entrada = new Scanner(System.in);
        int intentos = 3, contador = 1;
        String userNick = "mancos", UserClave = "1234";
        
        //Pido datos al usuario (nick y clave)
        System.out.println("Introduce el nick: ");
        String nick = entrada.nextLine();
        System.out.println("Introduce la clave");
        String clave = entrada.nextLine();
        
        // Compruebo que sea el nick y la clave
        while (intentos > 0 && (!nick.equals(userNick) || !clave.equals(UserClave))){
            System.out.println("Algo falla surmano");
            intentos--;
            System.out.println("Prueba de nuevo anda, intentos: "+contador+ " de 3");
            contador++;
            nick = entrada.nextLine();
            clave = entrada.nextLine();
        }
        // Muestro el resultado
        String result = intentos == 0 ? "Numero maximo de intentos" : "Bienvenido";
        System.out.println(result);
    }
}
