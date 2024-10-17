
package merida_Alvaro.EjerciciosClase;

public class random {
    public static void main(String[] args) {
        
        int sup, inf;
        
        sup = 3;
        inf = 0;
        
        int res = (int)(Math.random() * (sup + 1));
        System.out.println(res);
        
        inf = 1;
        sup = 4;
        
        res = (int)(Math.random() * sup + 1);
        System.out.println(res);
        
        inf = 3;
        sup = 8;
        
        res = (int)(Math.random() * (sup - inf + 1) + inf);
        System.out.println(res);    
    }
}
