public class Utas {

    private String utirany;
    private String uticel;
    private int kedvezmeny;


    public Utas(String utirany, String uticel, int kedvezmeny) {
        this.utirany = utirany;
        this.uticel = uticel;
        this.kedvezmeny = (kedvezmeny == 33 || kedvezmeny == 50 || kedvezmeny == 90) ? kedvezmeny : 0;
    }

    public String getUtirany() {
        return utirany;
    }

    public void setUtirany(String utirany) {
        this.utirany = utirany;
    }

    public String getUticel() {
        return uticel;
    }

    public void setUticel(String uticel) {
        this.uticel = uticel;
    }

    public int getKedvezmeny() {
        return kedvezmeny;
    }

    public void setKedvezmeny(int kedvezmeny) {
        if (kedvezmeny == 33 || kedvezmeny == 50 || kedvezmeny == 90) this.kedvezmeny = kedvezmeny;
        else throw new IllegalArgumentException("Nem megfelelo kedvezmeny: " + kedvezmeny);
    }
}
