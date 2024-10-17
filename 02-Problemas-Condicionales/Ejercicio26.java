package merida_Alvaro.Problemas02;

import java.util.Scanner;

public class Ejercicio26 {
/*
    El sistema de verificación en dos 
    pasos funciona de la siguiente manera:
    
    • Se le pide al usuario que introduzca 
    su nick, su email y la contraseña.
    
    • Si el email y la contraseña son correctos 
    (los datos se dicen en clase), el
    programa va a generar un número aleatorio
    de 4 cifras y lo va a mostrar por pantalla.
    
    • A continuación se vuelve a pedir el email,
    la contraseña y, esta vez, el número aleatorio.
    
    • Si todo ha ido correctamente, se mostrará 
    el mensaje: “Verificación aceptada.
    Bienvenid@: xxxxxx (siendo xxxxxx el 
    nick del usuario).
    
    • Si hay algún fallo, se mostrará un mensaje 
    de error.
    
    Crea un algoritmo que reproduzca 
    el comportamiento antes indicado.
*/
    public static void main(String[] args) {
        
        // Creo e inicializo las variables
        Scanner entrada = new Scanner(System.in);
        String realPassword = "1";
        String realEmail = "a";
        String password;
        String email;
        String userName;
        int min = 1000;
        int max = 9999;
        
        //clave aleatoria de 4 cifras
        int clave = (int)((Math.random() * max - min) + min);
        int claveUsuario;
        
        // Pido los datos del usuario y los registro
        System.out.println("Introduzca un usuario");
        userName = entrada.nextLine();
        System.out.println("Introduzca una contrasena");
        password = entrada.nextLine();
        System.out.println("Introduzca un email");
        email = entrada.nextLine();
        
        /*
        Compruebo que la contraseña y el email 
        sean correctos
        */
        if (password.equals(realPassword) 
            && email.equals(realEmail)) {
            System.out.println("clave :"+clave);
        }
        else {
            System.out.println("Error");
            System.out.println("Contrasena o Email "
                    + "incorrectos");
        }
        
        // Pido de nuevo los datos
        System.out.println("Introduzca de nuevo "
                + "la contrasena");
        password = entrada.nextLine();
        System.out.println("Introduzca de nuevo "
                + "el email");
        email = entrada.nextLine();
        System.out.println("Introduzca la clave");
        claveUsuario = entrada.nextInt();
        
        // Verifico de nuevo los datos (clave)
        if (password.equals(realPassword) 
            && email.equals(realEmail)
            && (claveUsuario == clave)) {
            System.out.println("Verificacion aceptada");
            System.out.println("Bienvenid@ "+userName);
        }
        else {
            System.out.println("Error");
            System.out.println("algo falla wacho");
        }
    }
}
