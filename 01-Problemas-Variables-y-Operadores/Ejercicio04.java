package merida_Alvaro.Problemas01;


import java.util.Scanner;


public class Ejercicio04 {
    public static void main(String[] args) {
        
        Scanner keyword = new Scanner(System.in);
        int m, n, counter = 0;
        
        System.out.println("Dime un numero");
        m = keyword.nextInt();
        counter++;
        System.out.println(counter+ " de 2");
        
        System.out.println("Dime otro");
        n = keyword.nextInt();
        
        double a = m / n * (m - n);
        double b = 12.3 / m + 5 - n * 9;
        double c = m * 2048 / n * 1024 - (Math.pow(m, n));
        double d = (Math.pow((3203 / m - n), n)) % 
        (Math.pow(n, 2)) * (Math.pow(m, 3));
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        keyword.close();
    }
}
