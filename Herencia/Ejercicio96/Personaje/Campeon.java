package Ejercicio96.Personaje;
import Ejercicio96.Habilidad;

public class Campeon extends Personaje {
    double puntosMagia;
    int nivel;
    String rol;
    Habilidad listaH[];

    public Campeon(double puntosMagia, 
            String rol, String nombre, double vida, 
            int x, int y, double escudo, double ataque,
            Habilidad primera) {
        
        super(nombre, vida, x, y, escudo, ataque);
        this.puntosMagia = puntosMagia;
        this.nivel = 1;
        listaH[0] = primera;
        
        if (rol.equals("Tanque")){
            this.puntosMagia = 100;
            this.vida = asignarVidaP(vida) + 150;
            this.escudo = asignarEscudoP(escudo);
            this.ataque = asignarAtaqueP(ataque);
        }
        else if(rol.equals("Support")){
            this.puntosMagia = 300;
            this.vida = asignarVidaP(vida) + 50;
            this.escudo = asignarEscudoP(escudo) + 50;
            this.ataque = asignarAtaqueP(ataque);
        }
        else if(rol.equals("Mago")){
            this.puntosMagia = 500;
            this.vida = asignarVidaP(vida);
            this.escudo = asignarEscudoP(escudo) + 150;
            this.ataque = asignarAtaqueP(ataque);
        }
        else if (rol.equals("Jungla")){
            this.puntosMagia = 200;
            this.vida = asignarVidaP(vida) + 100;
            this.escudo = asignarEscudoP(escudo);
            this.ataque = asignarAtaqueP(ataque);
        }
        else{
            this.rol = "Carry";
            this.puntosMagia = 300;
            this.vida = asignarVidaP(vida);
            this.escudo = asignarEscudoP(escudo) + 100;
            this.ataque = asignarAtaqueP(ataque); 
        }
    }
    
    public void subirNivel(Habilidad nueva){
        this.nivel++;
        this.vida++;
        this.escudo++;
        this.ataque++;
        if (this.nivel == 4 || this.nivel == 6 
                || this.nivel == 8){
            aniadirHabilidad(nueva);
        }
    }
    
    private double asignarAtaqueP(double magia) {
        return Math.random() * (7-3) + 3;
    }
    
    private double asignarEscudoP(double magia) {
        return Math.random() * (20-15) + 15;
    }
    private double asignarVidaP(double magia) {
        return Math.random() * (200-150) + 150;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void desplazarse(int x, int y) {
        super.desplazarse(x, y);
    }

    @Override
    public void atacar(Personaje enemigo) {
        super.atacar(enemigo);
    }
    
    
    // Utils
    private void aniadirHabilidad(Habilidad nueva){
        int i = 0;
        boolean puesta = false;
        while (i < listaH.length && !puesta){
                if (listaH[i] != null){
                    listaH[i] = nueva;
                    puesta = true;
                }
                i++;
            }
    }
}
