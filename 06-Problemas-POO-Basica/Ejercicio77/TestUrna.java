package Ejercicio77;
public class TestUrna {

    public static void main(String[] args){
        int randomB = (int)(Math.random() * 10 + 1);
        int randomN = (int)(Math.random() * 10 + 1);
        Urna urna = new Urna(randomB, randomN);
        System.out.println(urna.consultar());
        
        while (urna.numBolas() > 1){
            char bola1 = urna.extraerBola();
            char bola2 = urna.extraerBola();
            System.out.println(bola1);
            System.out.println(bola2);
            System.out.println(urna.consultar());
            
            if (bola1 == bola2)
                urna.ingresarBola('b');
            else
                urna.ingresarBola('n');
            
            System.out.println(urna.consultar());
        }
        if (urna.numBolas() == 1){
            if (urna.numBlancas() == 1)
            System.out.println("Se ha sacado la "
                + "ultima bola final de color: b");
            else
                System.out.println("Se ha sacado la "
                    + "ultima bola final de color: n");
        }
    }
}