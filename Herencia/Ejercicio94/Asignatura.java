package Ejercicio94;

public class Asignatura {
    private int codigo;
    private int numHoras;

    public Asignatura(int codigo, int numHoras) {
        this.codigo = codigo;
        this.numHoras = numHoras;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "codigo=" + codigo + 
                ", numHoras=" + numHoras + '}';
    }

    public int getNumHoras() {
        return numHoras;
    }

    public int getCodigo() {
        return codigo;
    }
}