public class Terreno {

    private double areaT;
    private Edificacao e;

    Terreno (double a) {
        areaT = a;
        e = null;
    }

    public Edificacao getEd () {
        return e;
    }

    public void setEd (Edificacao ed) {
        e = ed;
    }

    public double getAreaT () {
        return areaT;
    }

    public void setAreaT (double areaT) {
        this.areaT = areaT;
    }
}
