public class Casa  extends Edificacao {

    private boolean comGaragem;
    private boolean comPiscina;

    Casa (int qA, String m, double a, boolean comG, boolean comP) {
        super (qA, m, a);
        comGaragem = comG;
        comPiscina = comP;
    }
}
