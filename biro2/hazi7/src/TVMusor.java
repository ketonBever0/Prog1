public abstract class TVMusor implements BesorolassalRendelkezo {

    protected double hossz;
    protected final String nev;


    public TVMusor(String nev, double hossz) {
        this.setHossz(hossz);
        this.nev = nev;
    }

    public double getHossz() {
        return hossz;
    }

    public void setHossz(double hossz) {
        this.hossz = Math.max(0, hossz);
    }

    public String getNev() {
        return nev;
    }
}
