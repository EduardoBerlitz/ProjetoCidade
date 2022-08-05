public class Cidade {

    Terreno mapa[][];

    Cidade (int quadras, double areaT) {
        mapa = new Terreno[quadras][quadras];

        for (int i=0; i<quadras; i++) {
            for (int j=0; j<quadras; j++) {
                mapa[i][j] = new Terreno(areaT);
            }
        }
    }

    public short setTerreno (int i, int j, Edificacao ed) {
        if (!(mapa[i][j].getEd() instanceof Edificacao)) {
            if (ed.getArea() > mapa[i][j].getAreaT()) {
                return 2; //A área da edificação é maior que a área do terreno.
            }
            else {
                mapa[i][j].setEd(ed);
            }
        }
        else {
            return 1; //Já existe uma edificação neste terreno.
        }
        return 0; //Conseguiu associar uma casa ou edifício ao terreno.
    }

    public String statusMapa() {
        String m = "";
        for (int i=0; i<mapa.length; i++) {
            m += "\n";
            for (int j=0; j<mapa[i].length; j++) {
                if (mapa[i][j].getEd() instanceof Casa) {
                    m += "C";
                }
                else if (mapa[i][j].getEd() instanceof Edificio) {
                    m += "E";
                }
                else {
                    m += ".";
                }
            }
        }
        return m;
    }
}
