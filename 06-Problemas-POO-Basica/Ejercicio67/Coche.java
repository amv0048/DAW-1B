package Ejercicio67;

public class Coche {
    
    private final int NUM_RUEDAS;
    private String color;
    private double altura, anchura;
    private int numPuertas;
    private boolean parado; //True esta parado; false no
    private int gasolina;
    private final int MIN_GASOLINA, MAX_GASOLINA;
   
    
    public Coche(String color, double anchura, double altura, int numPuertas){
        this.color = color;
        this.anchura = anchura;
        this.altura = altura;
        this.numPuertas = numPuertas;
        this.NUM_RUEDAS = 4;
        parado = true;
        MIN_GASOLINA = 0;
        MAX_GASOLINA = 50;
    }
    
    public void arrancar(){
        if (parado && chequear()){
            System.out.println("Coche arrancado");
            parado = false;
            gasolina -= 5;
        }
        else
            System.out.println("Se necesita parar el coche");
    }
    
    public void parar(){
        if (!parado){
            System.out.println("Coche parado");
            parado = true;
        }
        else System.out.println("El coche ya esta parado");
    }
    
    public void desplazarse(){
        if (!parado && chequear()){
            System.out.println("Coche desplazandose");
            gasolina -= 20;
        }
        else System.out.println("Necesita arrancar el coche");
    }
    
    public void echarGasolina(int litros){
        if (parado && litros > MIN_GASOLINA 
                && litros <= MAX_GASOLINA)
            this.gasolina += litros;
        else System.out.println("Debes apagar el coche");
    }
    
    private boolean chequear(){
        if (gasolina >= MIN_GASOLINA 
                && gasolina <= MAX_GASOLINA)
            return true;
        return false;
    }
    
    public void pintar(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return "Coche\n" + "NUM_RUEDAS=" + NUM_RUEDAS + 
                "\n color:" + color + 
                "\n altura:" + altura + 
                "\n anchura:" + anchura + 
                "\n numPuertas:" + numPuertas 
                + "\n parado:" + parado 
                + "\n gasolina:" + gasolina;
    }
    
    
}
