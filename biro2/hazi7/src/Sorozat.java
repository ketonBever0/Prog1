public class Sorozat extends TVMusor implements BesorolassalRendelkezo {

    private int korhatarBesorolas;


    public Sorozat(String nev, double hossz, int... reszekKorhatarBesorolas) {
        super(nev, hossz);

        int max = -1;
        for (int ez : reszekKorhatarBesorolas) {
            if (ez > max) {
                max = ez;
            }
        }
        this.korhatarBesorolas = max;
    }

    @Override
    public int getKorhatarBesorolas() {
        return korhatarBesorolas;
    }
}
