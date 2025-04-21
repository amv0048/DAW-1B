package Abstraccion.Ejercicio99;

public class Main {
    public static void main(String[] args) {
        Conjunto conjunto1 = new Conjunto();
        Conjunto conjunto2 = new Conjunto();

        conjunto1.aniadir(1);
        conjunto1.aniadir(2);
        conjunto1.aniadir(3);
        conjunto1.aniadir(2); // repetido, no deberia añadirse

        conjunto2.aniadir(3);
        conjunto2.aniadir(4);
        conjunto2.aniadir(5);

        System.out.println("Conjunto 1: " + conjunto1); // [1,2,3]
        System.out.println("Conjunto 2: " + conjunto2); // [3,4,5]

        Conjunto union = conjunto1.union(conjunto2);
        System.out.println("Union: " + union); // [1,2,3,4,5]

        Conjunto interseccion = conjunto1.interseccion(conjunto2);
        System.out.println("Interseccion: " + interseccion); // [3]
    }
}

