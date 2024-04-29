public class Harcos implements Comparable<Harcos> {

    private String nev;
    private double ero;
    private int szint;

    public Harcos(String nev, double ero, int szint) {
        this.nev = nev;
        this.ero = ero;
        this.szint = szint;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public double getEro() {
        return ero;
    }

    public void setEro(double ero) {
        this.ero = ero;
    }

    public int getSzint() {
        return szint;
    }

    public void setSzint(int szint) {
        this.szint = szint;
    }

    @Override
    public String toString() {
        return this.nev + " ereje " + this.ero + ", " +
                "szintje " + this.szint;
    }

    @Override
    public int compareTo(Harcos kivel) {
        if(this.ero * this.szint < kivel.ero * kivel.szint)
            return 1;
        else if(this.ero * this.szint == kivel.ero * kivel.szint)
            return 0;
        else
            return -1;
    }
}

