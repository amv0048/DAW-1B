package Ejercicio83;

public class Cilindro {
    private int altura;
    private Circulo base;
    private double pi = 3.1416;
    
    public Cilindro(Circulo base, int altura){
        this.altura = altura;
        this.base = base;
    }
    
    public void volumen(){
        // V=πr2h
        double volumen = pi*Math.pow(base.getRadio(), 2)*this.altura;
        System.out.println("El volumen es: "+volumen);
    }

    @Override
    public String toString() {
        return "Cilindro{" + "altura=" + this.altura 
                + ", base=" + this.base + ", pi=" + this.pi + '}';
    }
    
    
}
