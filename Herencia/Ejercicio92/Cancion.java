package Ejercicio92;

public class Cancion extends Multimedia {

    private String artista;
    private String editor;
    private String genero;
    
    public Cancion(String titulo, String formato,
            String artista, String editor) {
        super(titulo, formato);
        this.artista = artista;
        this.editor = editor;
        if (!genero.equalsIgnoreCase("pop")
                || !genero.equalsIgnoreCase("rock")
                || !genero.equalsIgnoreCase("flamenco")
                || !genero.equalsIgnoreCase("hiphop")
                || !genero.equalsIgnoreCase("R&B")
                || !genero.equalsIgnoreCase("reggaeton"))
            this.genero = "pop";
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Cancion{" + "artista=" + artista + 
                ", editor=" + editor + ", genero=" + genero + '}';
    }
}