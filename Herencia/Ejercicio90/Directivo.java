package Ejercicio90;

public class Directivo extends Empleado {

    public Directivo(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Soy "+this.getNombre()+ 
                ", el directivo de la empresa";
    }
}