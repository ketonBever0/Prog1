public class Fogkefe {

    private int sortekSzama;
    protected double allapot = 100;
    private final String szin;


    public Fogkefe(String szin, int sortekSzama) {
        this.sortekSzama = sortekSzama;
        this.szin = szin;
    }

    public void setSortekSzama(int ujSzam) {
        this.sortekSzama = Math.min(ujSzam, this.sortekSzama);
    }

    public int getSortekSzama() {
        return sortekSzama;
    }

    public String getSzin() {
        return szin;
    }

    public double getAllapot() {
        return allapot;
    }

    public String toString() {
        return String.format("Egy %s szinu fogkefe, allapota: %f", this.getSzin(), this.getAllapot());
    }

    public boolean dizajnos() {
        return true;
    }

    public double fogmosas(int ido) {

        this.allapot -= ido * 0.5;

        return Math.min(ido / 3, 3) * (0.5 + 0.5 * (this.getAllapot() / 100)) * ((double) this.getSortekSzama() / 1000);

    }

    public boolean cserelniKell() {
        return this.getAllapot() < 20;
    }

}
