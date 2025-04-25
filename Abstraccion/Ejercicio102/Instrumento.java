package Abstraccion.Ejercicio102;

public abstract class Instrumento {
    private String marca;
    private String fecha;
    private Partitura musica;
    private boolean tocando;
    private boolean roto;

    public Instrumento(String marca, String fecha,
            Partitura musica) {
        this.marca = marca;
        this.fecha = fecha;
        this.musica = musica;
        this.tocando = false;
        this.roto = false;
    }

    public Instrumento() {
        this.marca = "desconocido";
        this.fecha = this.marca;
        int numNotas = (int)(Math.random() * 90 + 10);
        
        musica = new Partitura(20);
        
        for (int i = 0; i <= numNotas; i++) {
            int valorR = (int)(Math.random() * 6 + 1);
            int tiempo = (int)(Math.random() * 4 + 1);
            musica.aniadirNota(new Nota(valorR,tiempo));
        }
    }
    
    public String tocarPartitura(){
        String res="";
        if (!tocando && !roto){
            for (int i = 0; i < musica.getLista().length; i++) {
                res += musica.getLista()[i];
                
            }
        }
        return res;
    }
    
    public String pararDeTocar(){
        this.tocando = false;
        return "El instrumento ha dejado de tocar";
    }
    
    
    public abstract void afinarse();
    
}
