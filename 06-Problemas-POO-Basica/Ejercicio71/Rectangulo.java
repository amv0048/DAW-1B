package Ejercicio71;

public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double area(){
        return this.base * this.altura;
    }
    
    public double perimetro(){
        return (this.base + this.altura)*2;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
}