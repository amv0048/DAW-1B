package Ejercicio92;

public class Multimedia {
    private String titulo;
    private String formato;

    public Multimedia(String titulo, String formato) {
        this.titulo = titulo;
        if (!formato.equalsIgnoreCase("mp3")
                || !formato.equalsIgnoreCase("wav")
                || !formato.equalsIgnoreCase("mp4")
                || !formato.equalsIgnoreCase("mkv")
                || !formato.equalsIgnoreCase("mov")
                || !formato.equalsIgnoreCase("flv"))
            this.formato = "mp3";
        else this.formato = formato;
    }

    @Override
    public String toString() {
        return "Multimedia{" + "titulo=" + titulo + 
                ", formato=" + formato + '}';
    }
    
    public boolean equals(Multimedia otro){
        if (otro.formato.equals(this.formato) &&
                otro.titulo.equals(this.titulo))
            return true;
        return false;
    }
}