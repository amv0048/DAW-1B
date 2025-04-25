package Abstraccion.Ejercicio102;

public class Nota {
    private int valor;
    private int duracion; // Segundos
    private String nombre;

    public Nota(int valor, int duracion) {
        if (duracion >= 1 && duracion <= 10)
            this.duracion = duracion;
        else this.duracion = 1;
        
        switch (valor) {
            case 1:
             this.nombre = "do";   
                break;
            case 2:
             this.nombre = "re";   
                break;
            case 3:
             this.nombre = "mi";   
                break;
            case 4:
             this.nombre = "fa";   
                break;
            case 5:
             this.nombre = "sol";   
                break;
            case 6:
             this.nombre = "la";   
                break;
            case 7:
             this.nombre = "si";   
                break;
            default:
                this.nombre = "do";
        }
    }
    
    public Nota() {
        this.valor = 1;
        this.nombre = "do";
        this.duracion = 1;
    }
    
    @Override
    public String toString(){
        return "["+this.nombre+","+this.duracion+"]";
    }
}
