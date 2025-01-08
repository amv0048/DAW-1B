package RelacionYComposicion.Ejercicio82;


public class Guerrero {
    private String nombre;
    private int salud;
    private int ataque;
    private int escudo;
    private int SALUD_MAX;
    private boolean vivo; //True vivo; false muerto
    private Arma gun;
    private int nivel;
    private int experienciaActual;
    private int siguienteNivel;

    
    /**
     * Crea una clase Guerrero con los siguientes parametros
     * @param nombre: Nombre del guerrero
     * @param salud: Puntos de vida con los que cuenta el guerrero
     * @param ataque: Puntos de ataque/fuerza que tiene
     * @param escudo: Puntos de bloqueo del escudo
     * @param gun: Su arma principal 
     */
    public Guerrero(String nombre, int salud,
            int ataque, int escudo, Arma gun) {
        this.nombre = nombre;
        this.SALUD_MAX = salud;
        this.salud = this.SALUD_MAX;
        this.ataque = ataque;
        this.escudo = escudo;
        this.vivo = true;
        this.gun = gun;
        this.nivel = 1;
        this.experienciaActual = 0;
        this.siguienteNivel = (int)Math.round(this.nivel * 10 + 
                this.nivel * 1.5);
    }
    
    /**
     * Ataca a otro guerrero que se pasa como parametro
     * al atacar el gasta puntos de resistencia en el arma
     * y gana experiencia, devuelve la fuerza de ataque total
     * además de 0 si consigue atacar y -1 si no
     * @return 
     */
    public int atacar(Guerrero defensor){
        if (this.vivo && defensor.vivo){ //Tienen que estar vivos
            //Comprobar si traspasa el escudo y quitar vida
            checkEscudo(defensor);
            if (checkArma()){
                System.out.println(ataque + gun.getPoder());
                this.experienciaActual+= 3;
                if (this.subir())
                    subidaNivel();
                checkmuerte(defensor);
            }
            else{ // Si no tiene arma gana mas experiencia
                System.out.println(ataque);
                this.experienciaActual += 5;
                if (this.subir())
                    subidaNivel();
                checkmuerte(defensor);
            }   
        }
        else
            return -1;
        return 0;
    }
    /**
     * Comprueba si el ataque recibido traspasa el escudo,
     * resta el daño a la salud
     * @param defensor 
     */
    private void checkEscudo(Guerrero defensor){
        int resto = defensor.escudo - (ataque + gun.getPoder());
            if (resto <= 0){
                defensor.escudo = 0;
                defensor.salud += resto;// Quita salud al ser atacado
            }
            else defensor.escudo -= (ataque + gun.getPoder());
    }
    
    /**
     * Comprueba que el arma tenga resistencia, devolviendo true
     * o false, resta puntos de resistencia al arma
     * @return 
     */
    private boolean checkArma(){
        if (this.gun.getResistencia() > 1){// El arma tiene que tener resistencia              
            this.gun.QuitarResistencia(1); // al atacar el arma pierde
            return true;
        }
        return false;
    }
    /**
     * Comprueba si el atacado a muerto
     * @param defensor 
     */
    private void checkmuerte(Guerrero defensor){
        if (defensor.salud < 0)// Si no le queda salud muere
                    defensor.vivo = false;
    }
    
    @Override
    public String toString() {
        return "nombre: " + this.nombre + ", salud:" 
                + salud + ", ataque:" + ataque + ", escudo:" 
                + escudo + "\nArma: " + gun.toString();
    }
    
    /**
     * Si el nombre del Arma coincide el arma sube de nivel
     * llamando a subirNivel()
     * @param nombreArma 
     */
    public void mejorarArma(String nombreArma){
        if (this.gun.getNombre() == this.nombre)
            gun.subirNivel();
        else System.out.println("No coincide");
    }
    
    /**
     * Devuelve true si puede subir de nivel,
     * false si no
     * @return 
     */
    public boolean subir(){
        if (this.experienciaActual == this.siguienteNivel)
            return true;
        return false;
    }
    
    /**
     * Sube de nivel al heroe mejorando
     * sus caracteristicas
     */
    public void subidaNivel(){
        if (this.vivo){
            this.nivel++;
            this.experienciaActual = 0;
            this.siguienteNivel = siguienteNivel;
            this.ataque++;
            this.escudo++;
            this.SALUD_MAX += 10;
            
        }
            
    }
}