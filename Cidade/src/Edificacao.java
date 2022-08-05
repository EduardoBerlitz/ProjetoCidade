public class Edificacao {

    protected int quantAndares;
    protected String material;
    protected double area;

    Edificacao (int qA, String m, double a) {
        quantAndares = qA;
        material = m;
        area = a;
    }

    //Métodos get e set
    public int getQuantAndares () {
        return quantAndares;
    }

    public void setQuantAndares (int quantAndares) {
        this.quantAndares = quantAndares;
    }

    public String getMaterial () {
        return material;
    }

    public void setMaterial (String material) {
        this.material = material;
    }

    public double getArea () {
        return area;
    }

    public void setArea (double area) {
        this.area = area;
    }

}
