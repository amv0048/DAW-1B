package Ejercicio96;


public class Habilidad {
    String nombre;
    private double costeMana;
    int nivel;
    char tecla;
    private double danioBasico;

    public Habilidad(String nombre, char tecla) {
        this.nombre = nombre;
        this.tecla = tecla;
        this.nivel = 1;
        this.costeMana = (Math.random() * 9 + 1) * this.nivel/2;
        this.danioBasico = (Math.random() * 15 + 5) 
                * this.nivel/3;
    }
    
    private void subirNivel(){
        this.nivel++;
        this.costeMana = (Math.random() * 9 + 1) * this.nivel/2;
        this.danioBasico = (Math.random() * 15 + 5) * this.nivel/3;
    }
}