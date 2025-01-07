package Ejercicio73;

public class Persona {
    private String nombre, pais;
    private int edad;
    private char sexo;

    public Persona(String nombre, String pais, int edad, char sexo) {
        this.nombre = nombre;
        this.pais = pais;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    public String saludar(){
        String saludo = "Hola! me llamo "+this.nombre+ " y soy de "+this.pais;
        return saludo;
    }
    
    public void mostrarDatos(){
        boolean sex = false;
        
        String a = "Nombre "+this.nombre
                + "\nSoy de "+this.pais
                + "\nTengo "+this.edad
                + "\nY soy ";
        if (sexo == 'M')
            a+= "Hombre";
        else a+= "Mujer";
        System.out.println(a);
    }
    
    public boolean esMayorEdad(){
        return edad >= 18;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre +
                ", pais=" + pais + 
                ", edad=" + edad + 
                ", sexo=" + sexo + '}';
    }
    
    
}
