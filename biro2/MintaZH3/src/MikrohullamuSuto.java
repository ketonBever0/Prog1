public class MikrohullamuSuto extends Suto {

    private final int maximalisTeljesitmeny;


    public MikrohullamuSuto(String tipus, int maximalisTeljesitmeny) {
        super(tipus);
        this.maximalisTeljesitmeny = maximalisTeljesitmeny;
    }

    @Override
    public void koszossagNoveles() {
        super.setKoszossag(super.getKoszossag() + 1);
    }

    public boolean sut(String etelNeve, int hofok, int ido) {

        double teljesitmeny = 3.27 * hofok - 145.45;

        if (teljesitmeny > maximalisTeljesitmeny) return false;

        eteltBerak(etelNeve);

        super.setHaviFogyasztas((int) (super.getHaviFogyasztas() + ((teljesitmeny * ido) / 60)));

        this.koszossagNoveles();

        eteltKivesz();

        return true;

    }
}
