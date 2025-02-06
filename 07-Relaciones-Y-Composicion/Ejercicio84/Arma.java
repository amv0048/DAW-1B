package Ejercicio84;

public class Arma {
    private String nombre;
    private int resistencia;
    private int poder;
    private int nivel;
    
    /**
     * Crea un clase Arma con los siguientes parametros:
     * @param nombre: El nombre/modelo del arma
     * @param resistencia: Los puntos de resistencia con los que 
     * cuenta el arma
     * @param poder: Su poder de fuego
     */
    public Arma(String nombre, int resistencia, int poder) {
        this.nombre = nombre;
        this.resistencia = resistencia;
        this.poder = poder;
        this.nivel = 1;
    }
    
    public int getPoder(){
        return this.poder;
    }
    
    /**
     * resta puntos de resistencia al arma,
     * los devuelve modificado
     * @param puntos: Los puntos que gasta de resistencia
     * @return 
     */
    public int QuitarResistencia(int puntos){
        this.resistencia -= puntos;
        return this.resistencia;
    }
    
    public int getResistencia(){
        return this.resistencia;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    @Override
    public String toString() {
        return "nombre:" + nombre + 
                ", resistencia=:" + resistencia + 
                ", poder:" + poder;
    }
    
    /**
     * Sube de nivel el arma aumentando su nivel, poder
     * y resistencia
     */
    public void subirNivel(){
        this.nivel++;
        this.poder++;
        this.resistencia += 2;
    }
}