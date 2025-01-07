package Ejercicio68;

public class Punto {
    private int x, y;
    
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void moverHorizontal(int num){
        this.x += num;
    }
    
    public void moverVertical(int num){
        this.y += num;
    }
    
    public void mostrar(){
        System.out.println("Punto("+this.x+','+this.y+")");
    }

}