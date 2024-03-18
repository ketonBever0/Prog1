public class Macska {

    public String nev;
    private String szin;
    private boolean csizmas = false; //alapbol false

    public Macska(String nev, String szin, boolean csizmas) {
        this.nev = nev;
        this.szin = szin;
        this.csizmas = csizmas;
    }

    public Macska(String nev, String szin) {
        this.nev = nev;
        this.szin = szin;
        this.csizmas = false;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public boolean isCsizmas() {
        return csizmas;
    }

    public void setCsizmas(boolean csizmas) {
        this.csizmas = csizmas;
    }


    @Override
    public String toString() {
        return "Macska{" +
                "nev='" + nev + '\'' +
                ", szin='" + szin + '\'' +
                ", csizmas=" + csizmas +
                '}';
    }
}
