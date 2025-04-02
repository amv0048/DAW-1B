package Ejercicio91;

public class Perro extends Mamifero {
    
    private String raza;
    private String nombre;
    private boolean mezcla;
    
    public Perro(int numPatas, double mediaVida, 
            String raza,String nombre) {
        super(numPatas, mediaVida);
        this.raza = raza;
        this.mediaVida = mediaVida;
        this.mezcla = true;
    }

    @Override
    public void dormir() {
        System.out.println("18");
    }

    @Override
    public String comunicarse() {
        return "Guau guau";
    }

    public void jugar(){
        System.out.println(this.nombre+ "esta jugando");
    }

    public boolean isMezcla() {
        return mezcla;
    }

    public void setMezcla(boolean mezcla) {
        this.mezcla = mezcla;
    }

    @Override
    public String toString() {
        return "Soy un perro";
    }
    
    
    
}