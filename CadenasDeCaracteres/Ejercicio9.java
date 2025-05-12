package CadenasDeCaracteres;

public class Ejercicio9 {

    public static void main(String[] args) {
        String frase ="amuleto:5:200;"
                + "espada:1:300;"
                + "pocion:10:10";
        
        String item[] = frase.split(";");
        for (int i = 0; i < item.length; i++) {
            String tipo[] = item[i].split(":");
            System.out.println("Item: "+tipo[0]);
            System.out.println("cantidad: "+tipo[1]);
            System.out.println("Precio: "+tipo[2]);
            System.out.println("-----------");
        }
    }
}