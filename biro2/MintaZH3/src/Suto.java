
/**
 * Sütőt reprezentáló osztály.
 * <p>
 * Nem példányosítható
 */
public abstract class Suto {
    /**
     * A sütő típusa
     */
    private final String tipus;
    /**
     * A sütőben lévő étel
     */
    private String etel;
    /**
     * A sütő aktuális koszossága
     */
    private int koszossag = 0;
    /**
     * A sütő havi fogyasztása
     */
    private int haviFogyasztas = 0;

    public Suto(String tipus) {
        this.tipus = tipus;
    }

    /**
     * Étel berakása a sütőbe
     *
     * @param mi az étel, amit berakunk
     */
    public void eteltBerak(String mi) {
        this.etel = mi;
    }

    /**
     * Étel kivétele
     */
    public void eteltKivesz() {
        this.etel = null;
    }

    /**
     * A sütő kitakarítása
     */
    public void kitakarit() {
        koszossag = 0;
    }

    /**
     * Egy étel megsütésének folyamata.
     *
     * @param etelNeve  az étel, amit megsütünk
     * @param hanyFokon a sütni kívánt hőfok
     * @param meddig    a sütés ideje
     * @return true, ha sikerül a sütés, false különben
     */
    public abstract boolean sut(String etelNeve, int hanyFokon, int meddig);

    /**
     * A koszosság növelése
     */
    public abstract void koszossagNoveles();


    /*
    * Szükséges getterek és setterek
    */

    public int getKoszossag() {
        return koszossag;
    }

    public void setKoszossag(int koszossag) {
        this.koszossag = koszossag;
    }

    public int getHaviFogyasztas() {
        return haviFogyasztas;
    }

    public void setHaviFogyasztas(int haviFogyasztas) {
        this.haviFogyasztas = haviFogyasztas;
    }
}
