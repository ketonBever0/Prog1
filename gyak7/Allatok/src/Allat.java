public abstract class Allat {
//  abstract - nem példányosítható
    public String nev;
    private int ero;
    private double jollakottsag = 1;


    public Allat(String nev, int ero, double jollakottsag) {
        this.nev = nev;
        this.ero = ero;
        setJollakottsag(jollakottsag);
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getEro() {
        return ero;
    }

    public void setEro(int ero) {
        this.ero = ero;
    }

    public double getJollakottsag() {
        return jollakottsag;
    }

    public void setJollakottsag(double jollakottsag) {
        this.jollakottsag = Math.max(0, Math.min(jollakottsag, 1));
    }

//    @Override
//    public abstract String toString();
//    nincs törzse

    public abstract String hangotAd();

}
