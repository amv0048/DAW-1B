package Abstraccion.Ejercicio102;

public abstract class Instrumento {
    private String marca;
    private String fecha;
    protected Partitura musica;
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
        this.tocando = false;
        this.roto = false;
        musica = new Partitura(20);
        
        for (int i = 0; i <= numNotas; i++) {
            int tiempo = (int)(Math.random() * 5 + 1);
            this.aniadirNota();
        }
    }
    
    public boolean aniadirNota(){
        int valorR = (int)(Math.random() * 7 + 1);
        int tiempo = (int)(Math.random() * 5 + 1);
        String tipos[] = {"do","re","mi","fa","sol"
                ,"la","si","do",};
        
        Nota nueva = new Nota(tipos[valorR], tiempo);
        return this.musica.addNota(nueva);
    }
    
    public abstract String tocarPartitura();
    
    public void pararDeTocar(){
        this.tocando = false;
    }
    
    public abstract void afinar();
    
}