public class Edificio extends Edificacao {

    private int quantElevadores, quantVagasBox;

    Edificio (int qA, String m, double a, int qE, int qVB) {
        super (qA, m, a);
        quantElevadores = qE;
        quantVagasBox = qVB;
    }
}
