package Abstraccion.Ejercicio102;


public class Piano extends Cuerda{
    
    private int numTeclas;
    private String tipo;
    private static final int MAX_TECLAS = 88;
    private static final int MIN_TECLAS = 49;
    
    public Piano(int numTeclas, int tipo){
        super();
        if (numTeclas >= MIN_TECLAS && numTeclas <= MAX_TECLAS)
            this.numTeclas = numTeclas;
        switch (tipo) {
            case 1:
                this.tipo = "pared";
                break;
            case 2:
                this.tipo = "cola";
                break;
            case 3:
                this.tipo = "electrico";
                break;
            default:
                this.tipo = "pared";
        }
        
        
    }
    
    @Override
    public void afinarse() {
        System.out.println("Se han tensado correctamente"
                + "las "+this.numTeclas+" del piano");
    }
    
}
