package Ejercicio92;

public class Pelicula extends Multimedia {

    private String actorP;
    private String actrizP;
    
    public Pelicula(String titulo, String formato,
        String actor, String actriz) {
        super(titulo, formato);
        this.actorP = actor;
        this.actrizP = actriz;
    }

    public String getActorP() {
        return actorP;
    }

    public void setActorP(String actorP) {
        this.actorP = actorP;
    }

    public String getActrizP() {
        return actrizP;
    }

    public void setActrizP(String actrizP) {
        this.actrizP = actrizP;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "actorP=" + actorP + 
                ", actrizP=" + actrizP + '}';
    }

    public boolean equals(Pelicula otro) {
        if (otro.actorP.equals(this.actorP) &&
                otro.actrizP.equals(this.actrizP))
            return true;
        return false;
    }
}