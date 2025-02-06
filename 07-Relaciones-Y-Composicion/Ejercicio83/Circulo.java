package Ejercicio83;

public class Circulo {
    private double radio;
    private int x, y;
    private final double pi;
    private Punto centro;
    
    public Circulo(Punto a, double radio){
        this.centro = a;
        this.radio = radio;
        this.x = a.getX();
        this.y = a.getY();
        pi = 4.1416;
    }
    
    public void calcularArea(){
        // A = πr2
        double area = pi*Math.pow(this.radio, 2);
        System.out.println("El area es: "+area);
    }
    
    public void calcularPerimetro(){
        // P = 2πr
        double perimetro = 2*pi*radio;
        System.out.println("El perimetro es: "+perimetro);
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + this.radio 
                + ", x=" + this.x + ", y=" + this.y 
                + ", pi=" + this.pi + ", centro=" + this.centro + '}';
    }

    
    
    public void trasladar(int a, int b){
        this.x += x;
        this.y += y;
    }
    
    public double getRadio(){
        return this.radio;
    }
}
