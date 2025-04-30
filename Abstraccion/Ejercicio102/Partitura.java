package Abstraccion.Ejercicio102;

public class Partitura {
    private String nombre;
    private String autor;
    private Nota[] lista;
    private final int MAX_NOTAS = 100;
    private final int MIN_NOTAS = 1;

    public Partitura(String nombre, String autor, int numNotas) {
        this.nombre = nombre;
        this.autor = autor;
        if (numNotas >= MIN_NOTAS && numNotas <= MAX_NOTAS)
            lista = new Nota[numNotas];
        inicializar(lista);
    }

    public Partitura(int numNotas) {
        if (numNotas >= MIN_NOTAS && numNotas <= MAX_NOTAS)
            lista = new Nota[numNotas];
        inicializar(lista);
    }
    
    public int numNotas(){
        int contador = 0;
        while (this.lista[contador] != null) {
            contador++;
        }
        return contador;
    }
    
    public boolean addNota(Nota newNote){
        int cont = this.numNotas();
        if (cont == this.lista.length -1){
            return false;
        }
        this.lista[cont] = newNote;
        return true; 
    }

    @Override
    public String toString() {
        String res = this.nombre+" de "+this.autor+"\n";
        for (int i = 0; i < this.numNotas(); i++) {
            res += lista[i].toString();
            if (i % 10 == 0 && i != 0)
                res+= "\n";
        }
        return res;
    }

    public Nota[] getLista() {
        return lista;
    }
    
    private void inicializar(Nota lista[]){
        for (int i = 0; i < lista.length; i++) {
            lista[i] = null;
            
        }
        
    }
}