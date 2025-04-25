package Abstraccion.Ejercicio102;

public class Partitura {
    private String nombre;
    private String autor;
    private Nota[] lista;
    private final static int MAX_NOTAS = 100;
    private final static int MIN_NOTAS = 1;

    public Partitura(String nombre, String autor, int numNotas) {
        this.nombre = nombre;
        this.autor = autor;
        if (numNotas >= MIN_NOTAS && numNotas <= MAX_NOTAS)
            lista = new Nota[numNotas];
    }

    public Partitura(int numNotas) {
        if (numNotas >= MIN_NOTAS && numNotas <= MAX_NOTAS)
            lista = new Nota[numNotas];
    }
    
    
    
    public int numNotas(){
        int contador = 0;
        for (int i = 0; i < this.lista.length; i++) {
            if (lista[i] != null)
                contador++;            
        }
        return contador;
    }
    
    public boolean aniadirNota(Nota newNote){
        int cont = 0;
        while (cont < this.lista.length){
            if (lista[cont] == null){
                lista[cont] = newNote;
                return true;
            }
            cont++;
        }
        return false; 
    }

    @Override
    public String toString() {
        int cont = 0;
        String res = "Para "+this.nombre+" de "+this.autor+"\n";
        for (int i = 0; i < this.lista.length; i++) {
            if (lista[i] != null){
                res += lista[i].toString();
                cont++;
                if (cont % 10 == 0)
                    res+= "\n";
            }
        }
        return res;
    }

    public Nota[] getLista() {
        return lista;
    }
    
    
}
