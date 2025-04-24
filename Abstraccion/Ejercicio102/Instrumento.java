package Abstraccion.Ejercicio102;

public class Instrumento {
    private String marca;
    private String fecha;
    private Partitura musica;
    private boolean tocando;
    private boolean roto;

    public Instrumento(String marca, String fecha, Partitura musica) {
        this.marca = marca;
        this.fecha = fecha;
        this.musica = musica;
        this.tocando = false;
        this.roto = false;
    }

    public Instrumento() {
        this.marca = "desconocido";
        this.fecha = this.marca;
        int tiempo = (int)(Math.random() * 4 + 1);
        int numNotas = (int)(Math.random() * 90 + 10);
        int valorR = (int)(Math.random() * 6 + 1);
        for (int i = 0; i < numNotas; i++) {
            musica.aniadirNota(new Nota("do",tiempo));
        }
    }
    
    public String tocarPartitura(){
        
    }
    
    public String pararDeTocar(){
        this.tocando = false;
        return "El instrumento ha dejado de tocar";
    }
    
    
    
    
}
