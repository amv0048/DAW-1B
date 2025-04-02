package Ejercicio91;

public class Gato extends Mamifero {

    private String raza;
    private String nombre;
    private String pelaje;
    
    
    public Gato(int numPatas, double mediaVida, 
            String raza,String nombre) {
        super(numPatas, mediaVida);
        this.raza = raza;
        this.mediaVida = mediaVida;   
        this.pelaje = "Corto";
    }
    
    
    public String getPelaje(){
        return this.pelaje;
    }
    
    public void setPelaje(String p){
        if (p.equalsIgnoreCase("largo") 
                || p.equalsIgnoreCase("semilargo"))
            this.pelaje = p;
    }

    @Override
    public void dormir() {
        System.out.println("15");
    }

    @Override
    public String comunicarse() {
        return "miau miau";
    }

    @Override
    public String toString() {
        return "Gato{" + "raza=" + raza + ", nombre=" + nombre + ", pelaje=" + pelaje + '}';
    }
}