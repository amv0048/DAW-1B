package merida_Alvaro.Problemas01;


public class Ejercicio07 {
    public static void main(String[] args) {
        String cad = "Volando, volando... siempre arriba";
        String firsSeven = cad.substring(0, 7);
        String lastSeven = cad.substring(cad.length() - 7, cad.length());
        
        int search1 = firsSeven.indexOf("d");
        int search2 = lastSeven.indexOf("d");
        
        System.out.println(search1);
        System.out.println(search2);
    }

}
