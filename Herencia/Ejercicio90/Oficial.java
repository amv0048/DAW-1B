package Ejercicio90;

public class Oficial extends Operario {

    public Oficial(String nombre, int codigo) {
        super(nombre, codigo);
    }

    @Override
    public String toString() {
        return "Soy el oficial "+this.getNombre()+" con el"
                + "codigo "+this.getCodigo();
    }
}