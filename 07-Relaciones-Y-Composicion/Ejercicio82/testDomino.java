
package Ejercicio82;

public class testDomino {

    public static void main(String[] args) {
        fichaDomino x = new fichaDomino(4, 3);
        System.out.println(x);
        fichaDomino b = new fichaDomino(9, 3);
        System.out.println(b);
        System.out.println(b.encaja(x));
        b.voltear();
        System.out.println(b);
        System.out.println(b.encaja(x));
    }
}