package Abstraccion.Ejercicio102;


public class Piano extends Cuerda{
    
    private String tipoPiano;
    private int numTeclas;
    private static final int MAX_TECLAS = 88;
    private static final int MIN_TECLAS = 49;

    public Piano(String tipoPiano, int numTeclas, int numCuerdas, boolean tipoCuerda, String marca, String fecha, Partitura musica) {
        super(numCuerdas, tipoCuerda, marca, fecha, musica);
        this.tipoPiano = tipoPiano;
        this.numTeclas = (int)(Math.random() * (88-49+1) + 49);
    }

    public Piano(String tipoPiano, int numTeclas, int numCuerdas, boolean tipoCuerda) {
        super(numCuerdas, tipoCuerda);
        this.tipoPiano = tipoPiano;
        this.numTeclas = numTeclas;
    }

    @Override
    public String tocarPartitura() {
        String res = "";
        String sonidos[] = {"ton","ten","tin","tan"
                ,"tun","tean","tain"};
        int total = this.musica.numNotas();
        
        for (int i = 0; i < total; i++) {
            Nota notita = this.musica.getLista()[i];
            for (int j = 0; j < notita.duracion; j++) {
                switch (notita.tipo) {
                    case "do":
                        res += "ton";
                        break;
                    case "re":
                        res += "ten";
                        break;
                    case "mi":
                        res += "tin";
                        break;
                    case "fa":
                        res += "tan";
                        break;
                    case "sol":
                        res += "tun";
                        break;
                    case "la":
                        res += "tean";
                        break;
                    case "si":
                        res += "tain";
                        break; 
                    default:
                        res += "ton";
                }
            }
        }
        return res;
    }
    
    @Override
    public void afinar() {
        System.out.println("Se han tensado correctamente"
                + "las "+this.getNumCuerdas()+" del piano");
    }
    
}
