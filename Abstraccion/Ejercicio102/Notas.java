package Abstraccion.Ejercicio102;

public class Nota {
    private String valor;
    private int duracion; // Segundos

    public Nota(String valor, int duracion) {
        if (duracion >= 1 && duracion <= 10)
            this.duracion = duracion;
        else this.duracion = 1;
        
        if (!valor.equals("do") || !valor.equals("re")|| !valor.equals("mi") || 
                !valor.equals("fa") ||!valor.equals("sol")
                ||!valor.equals("la") ||!valor.equals("si"))
            this.valor = "do";
    }
    
    public Nota() {
        this.valor = "do";
        this.duracion = 1;
    }
    
    @Override
    public String toString(){
        return "["+this.valor+","+this.duracion+"]";
    }
}
