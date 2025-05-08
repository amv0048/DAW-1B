package Excepciones.Ejercicio112;

public class Gato {
    private String nombre;
    private int edad;

    public Gato(String nombre, int edad) throws Exception {
        if (edad < 0)
            throw new Exception("La edad no puede ser negativa");
        else
            this.edad = edad;
        if (nombre.length() < 4)
            throw new Exception("El nombre debe tener al menos 3 caracteres");
        else
            this.nombre = nombre;     
    }
    
    public String toString(){
        return "El gatito "+this.nombre+" tiene "+this.edad+" anios de edad";
    }
}