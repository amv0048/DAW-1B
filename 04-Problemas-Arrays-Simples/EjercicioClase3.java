package Problemas_04_Arrays;

public class EjercicioClase3 {
/*
    Encontrar el mayor y el menor de un array
    Contar el numero de veces que aparece un elemento
    en un array de numeros.
    b) En un array de cadenas
*/
    public static void main(String[] args) {
        // Array Principal
        int array[] = {5, 8, 28, 28, 100, 28, 27, 100};
        // 1)
        int max = -6666, min = 9999, contadorMax = 0, contadorMin = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
            else if (array[i] < min)
                min = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if (max == array[i])
                contadorMax++;
            else if (min == array[i])
                contadorMin++;
        }   
        System.out.println("MAX: "+max);
        System.out.println("El numero "+max+ " aparece: "
                +contadorMax+ (contadorMax == 1 ? " vez" : " veces"));
        System.out.println("MIN: "+min+ " numero de veces: "+contadorMin);
        
        // b)
        int contadorCad = 0;
        String nombre = "Ivan";
        String arrayB[] = {"Jose","Gabriel","Ivan","Javier", "Ivan"};
        for (int i = 0; i < arrayB.length; i++) {
            if (arrayB[i].equalsIgnoreCase(nombre))
                contadorCad++;
        }
        System.out.println("El nombre "+nombre+" aparece: "
                + ""+contadorCad+(contadorCad == 1? " vez" : " veces"));
    }
}
