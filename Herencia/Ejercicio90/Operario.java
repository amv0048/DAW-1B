package Ejercicio90;

public class Operario extends Empleado {

    private int codigo;
    
    public Operario(String nombre, int codigo) {
        super(nombre);
        this.codigo = codigo;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public void setCodigo(int c){
        this.codigo = c;
    }

    @Override
    public String toString() {
        return "Soy el operario "+this.getNombre()+ " con el"
                + " codigo "+this.codigo;
    }
}