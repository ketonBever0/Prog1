//abstract - nem lehet peldanyositani
//ez akkor jo, ha a gyerekei miatt csinaljuk - vagy esetleg
//a static dolgai miatt

public abstract class Allat {

    public String nev;
    private int ero;
    private double jollakottsag = 1;

    public Allat(String nev, int ero, double jollakottsag) {
        this.nev = nev;
        this.ero = ero;
        this.setJollakottsag(jollakottsag);
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
        if (jollakottsag < 0) jollakottsag = 0;
        else if (jollakottsag > 1) jollakottsag = 1;
        this.jollakottsag = jollakottsag;
    }

    //absztrakt fuggveny - nem adjuk meg a torzset,
    //de az osszes nem absztrakt leszarmazottjanak lesz ilyen
    //a nem absztrakt osztalynak nincs absztrakt fuggvenye
    public abstract String hangotAd();

    @Override
    public String toString() {
        return String.format("%s egy %s, akinek ereje %d, jollakottsaga %.2f",
                this.nev, this.getClass(), this.ero, this.jollakottsag);
    }
}
