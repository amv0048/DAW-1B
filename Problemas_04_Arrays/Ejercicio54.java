package Problemas_04_Arrays;

public class Ejercicio54 {
/*
    Haz un programa que dado el array valores que
    posee los números 2,4,6,8,1,3,5,7 genere otro 
    array con los mismos valores pero con el valor 200 en
    la posición 4 y el valor 300 en la posición 7 
    (y el resto de valores afectados desplazados
    una posición).
    Valores: 2 4 6 8 1 3 5 7
    Otra: 2 4 6 200 8 1 300 3 5 7
*/
    public static void main(String[] args) {
        int array[] = {2,4,6,8,1,3,5,7};
        int arrayClonado[] = new int[array.length + 2];
        
        for (int i = 0; i < arrayClonado.length; i++) {
            if (i < 3)
                arrayClonado[i] = array[i];
            else if (i == 3)
                arrayClonado[i] = 200;
            else if (i > 3 && i < 6)
                arrayClonado[i] = array[i - 1];
            else if (i == 6)
                arrayClonado[i] = 300;
            else
                arrayClonado[i] = array[i - 2];            
        }
        // Mostrar resultado
        for (int i = 0; i < arrayClonado.length; i++) {
            System.out.print("["+arrayClonado[i] + "]");
        }
    }
}