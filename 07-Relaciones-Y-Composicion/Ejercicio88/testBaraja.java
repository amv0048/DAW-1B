package Ejercicio88;

public class testBaraja {

    public static void main(String[] args) {
        Baraja a = new Baraja();
        System.out.println(a.mostrar());
        System.out.println();
        System.out.println(a.darCartas(5));
        System.out.println(a.mostrar());
        System.out.println("");
        a.cartasUsadas();
    }

}
