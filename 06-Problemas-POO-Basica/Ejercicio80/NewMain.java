package Ejercicio80;

public class NewMain {

    public static void main(String[] args) {
        Pila stack = new Pila(10);
        
        stack.insertar(1);
        stack.insertar(2);
        stack.insertar(3);
        stack.insertar(4);
        stack.insertar(5);
        stack.insertar(6);
        stack.insertar(7);
        stack.insertar(8);
        stack.insertar(9);
        stack.insertar(10);
        System.out.println(stack.llena());
        System.out.println(stack);
        stack.extraer();
        System.out.println(stack);
        System.out.println(stack.cima());
        stack.vaciar();
        System.out.println(stack.vacia());
        System.out.println(stack);
       
    }
}