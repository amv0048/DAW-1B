package Ejercicio90;

public class Tecnico extends Operario {
    public Tecnico(String nombre, int codigo) {
        super(nombre, codigo);
    }

    @Override
    public String toString() {
        return "Soy el tecnico "+this.getNombre()+" con el"
                + "codigo "+this.getCodigo();
    }
}
