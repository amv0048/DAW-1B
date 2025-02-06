package Ejercicio85;

public class Cielo {
    private Estrella array[][];
    int numEstrellas;
    
    public Cielo(int filas, int columnas){
        if (filas >= 0 || columnas >= 0){
            this.array = new Estrella[filas][columnas];
            iniArray();
        }
    }
    
    public void ponerEstrellas(int num) {
        int tamCielo = this.array.length
                * this.array[0].length;
        if (num <= tamCielo) {
            int fil = 0, col = 0;
            for (int i = 0; i < num; i++) {
                do {                
                    fil = (int)(Math.random() * array.length);
                    col = (int)(Math.random() * array[0].length);
                } while (array[fil][col] != null);
                Estrella nueva = new Estrella();
                array[fil][col] = nueva;
            }
        }
        else System.out.println("ERROR");
    }
    
    private void iniArray(){
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array.length; j++) {
                this.array[i][j] = null;
            }
        }
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != null)
                    res += array[i][j]+" ";    
                else res+= " ";
            }
            res+= "\n";
        }
        return res;
    }   
}