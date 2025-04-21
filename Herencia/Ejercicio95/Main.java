package Ejercicio95;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ruedas;
        
        Coche coche1 = new Coche(120, 3, "blue", 4);
        Coche coche2 = new Coche(120, 20, "rojo", 4);
        
        Bicicleta bici1 = new Bicicleta("urbana", "verde", 2);
        Bicicleta bici2 = new Bicicleta("deportiva", "vamarilla", 2);
        
        Camioneta ca1 = new Camioneta(300, 120, 6, "violeta", 4);
        Camioneta ca2 = new Camioneta(400, 100, 8, "blanco", 4);
        
        Motocicleta moto1 = new Motocicleta(300, 4, "deportiva",
                "negra", 2);
        Motocicleta moto2 = new Motocicleta(300, 4, "deportiva",
                "negra", 2);
        
        System.out.print("Ingrese el numero de ruedas a buscar: ");
        ruedas = entrada.nextInt();
          
        int contador = 0;
        
        List<Vehiculo> lista = new ArrayList<>();
        
        lista.add(coche1);lista.add(coche2);
        lista.add(bici1);lista.add(bici2);
        lista.add(ca1);lista.add(ca2);
        lista.add(moto1);lista.add(moto2);
        
        for (Vehiculo i : lista){
            if (i.getNumRuedas() == ruedas)
                contador++;
        }
        
        System.out.println("Se han encontrado "+contador+
                " vehiculos con "+ruedas+" ruedas.");
        
        for (Vehiculo b : lista){
            if (b instanceof Bicicleta bicicleta)
                bicicleta.tocarTimbre();
        }
    }
}
