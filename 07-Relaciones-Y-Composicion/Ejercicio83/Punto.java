package Ejercicio83;

public class Punto {
    private int x, y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void trasladar(int x, int y){
        this.x += x;
        this.y += y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    
    
    @Override
    public String toString() {
        return "Punto{" + "x=" + this.x + ", y=" + this.y + '}';
    }
    
    
}
