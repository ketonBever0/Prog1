public class Gazsuto extends Suto {

    private final int maximumHofok;


    public Gazsuto(String tipus, int maximumHofok) {
        super(tipus);
        this.maximumHofok = maximumHofok;
    }

    @Override
    public void koszossagNoveles() {
        super.setKoszossag((super.getKoszossag() * 2) + 1);
    }

    public boolean sut(String etelNeve, int hofok, int ido) {
        if (hofok > this.maximumHofok) return false;

        eteltBerak(etelNeve);

        super.setHaviFogyasztas(super.getHaviFogyasztas() + 10);

        if (hofok > 75) super.setHaviFogyasztas(super.getHaviFogyasztas() + (2 * (hofok - 75)));

        super.setHaviFogyasztas(super.getHaviFogyasztas() + ido);

        this.koszossagNoveles();

        super.eteltKivesz();

        return true;



    }
}
