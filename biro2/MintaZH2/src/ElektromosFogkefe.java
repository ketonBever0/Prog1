public class ElektromosFogkefe extends Fogkefe {

    private Fej fej;
    private final boolean cserelhetoFej;


    public ElektromosFogkefe(String szin, int sortekSzama, boolean cserelhetoFej) {
        super(szin, sortekSzama);
        this.cserelhetoFej = cserelhetoFej;
    }

    @Override
    public double getAllapot() {
        return (super.getAllapot() + fej.getAllapot()) / 2;
    }

    @Override
    public double fogmosas(int ido) {

        super.allapot -= ido * 0.1;
        fej.setAllapot(fej.getAllapot() - (ido * 0.5));


        return switch (ido) {
            case 1 -> ido * 0.50;
            case 2 -> ido * 0.75;
            default -> ido;
        };

    }

    public boolean cserelniKell() {
        return fej.getAllapot() < 10;
    }

    public void fejCsere(Fej ujFej) {

        if (!this.cserelhetoFej) {
            System.err.println("Ez nem cserelheto feju fogkefe!");
            return;
        }

        if (this.fej == ujFej) {
            System.err.println("Ugyanazt a fejet nem lehet rarakni ujra!");
            return;
        }

        this.fej = ujFej;

    }

    @Override
    public boolean dizajnos() {
        return super.getSzin().equals(fej.getSzin());
    }
}
