package Ejercicio85;


public class Estrella {
    int x;
    int y;
    char forma;
    
    public Estrella(){
        this.x = (int)(Math.random() * 3+1);
        this.y = (int)(Math.random() * 3+1);
        if (this.x == 2 && this.y == 2)
            this.forma = '*';
        else this.forma = '.';
    }

    @Override
    public String toString() {
        return this.forma+" ";
    }
}
