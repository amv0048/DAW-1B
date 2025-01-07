package Ejercicio77;

public class Urna {
    private int blancas;
    private int negras;

    public Urna(int blancas, int negras) {
        this.blancas = blancas;
        this.negras = negras;
    }
    
    public int numBolas(){
        return numBlancas() + this.negras;
    }
    
    public int numBlancas(){
        return this.blancas;
    }
    
    public int numNegras(){
        return this.negras;
    }
    
    public String consultar(){
        return  "Quedan " + this.blancas + " Blancas y "
                + this.negras + " negras";
    }
    
    public char extraerBola(){
        int random = (int)((Math.random() * numBolas()) + 1);
        if (numBlancas() >= random) {
            this.blancas--;
            return 'b';   
        }
        else{
            this.negras--;
            return 'n';
        }     
    }
    
    public void ingresarBola(char color){
        boolean bola = false; // True = blanca; false = negra
        if (color == 'b') {
            this.blancas++;
            bola = true;     
        }
        else if (color == 'n'){
            this.negras++;
            bola = false;
        }
        if (bola)
            System.out.println("Se ha metido una bola BLANCA");
        else
            System.out.println("Se ha metido una bola NEGRA");
    }
}