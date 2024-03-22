public class Fej {

    private double allapot = 100;
    private final String szin;


    public Fej(String szin) {
        this.szin = szin;
    }

    public double getAllapot() {
        return this.allapot;
    }

    public void setAllapot(double ujAllapot) {
        this.allapot = Math.min(Math.max(ujAllapot, 0), this.allapot);
    }

    public String getSzin() {
        return this.szin;
    }
}
