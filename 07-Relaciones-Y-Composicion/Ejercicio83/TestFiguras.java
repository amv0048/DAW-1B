package Ejercicio83;

public class TestFiguras {

    public static void main(String[] args) {
        // ATENCION: Si trasladas el punto, ni el circulo ni el cilindro deben trasladarse automaticamente.
        // Lo mismo si trasladas el circulo, el cilindro no debe trasladarse automaticamente.
        // Veamos si lo has hecho bien :)

        Punto p = new Punto(2, 2);
        System.out.println("Punto: " + p);

        Circulo c = new Circulo(p, 5);
        System.out.println("Circulo: " + c);

        Cilindro cili = new Cilindro(c, 20);
        System.out.println("Cilindro: " + c);

        p.trasladar(5, 7);
        System.out.println("Punto trasladado!! " + p);
        System.out.println("Circulo: " + c);
        System.out.println("Cilindro: " + c);
        
        c.trasladar(10,10);
        System.out.println("Circulo trasladado!! " + c);
        System.out.println("Cilindro: " + c);
        
        //Instanciamos un cilindro en una sola linea
        Cilindro extenso = new Cilindro(new Circulo(new Punto(23,25),45),90);
        System.out.println("Cilindro: " + extenso);
        
        /*Punto p = new Punto(2, 2);
        System.out.println(p);
        
        Circulo c = new Circulo(p, 16);
        c.trasladar(2, 2);
        System.out.println(c);*/
    }

}
