package merida_Alvaro.Problemas01;


public class Ejercicio06 {
    public static void main(String[] args) {
        String cad = "LA LLUVIA EN SEVILLA ES UNA MARAVILLA";
        
        String sevilla = cad.substring(13, cad.length());
        String lluvia = cad.substring(0, 9) + cad.substring(20, cad.length());
        
        System.out.println(sevilla);
        System.out.println(lluvia);
    }
}
