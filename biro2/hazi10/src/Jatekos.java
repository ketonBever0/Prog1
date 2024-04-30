public class Jatekos {

    private String nev;
    private int kor;
    private int magassag;
    private int suly;


    public Jatekos(String nev, int kor, int magassag, int suly) {
        this.nev = nev;
        this.kor = kor;
        this.magassag = magassag;
        this.suly = suly;
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    public int getMagassag() {
        return magassag;
    }

    public int getSuly() {
        return suly;
    }
}
