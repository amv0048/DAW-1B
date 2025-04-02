package Ejercicio93;


public class Producto {
    private String fechaCad;
    private int numLote;

    public Producto(String fechaCad, int numLote) {
        this.fechaCad = fechaCad;
        this.numLote = numLote;
    }

    public String getFechaCad() {
        return fechaCad;
    }

    public void setFechaCad(String fechaCad) {
        this.fechaCad = fechaCad;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    @Override
    public String toString() {
        return "Producto{" + "fechaCad=" + fechaCad + 
                ", numLote=" + numLote + '}';
    }
    
    
}