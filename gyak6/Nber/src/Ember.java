//  mappa

public class Ember {

    //tulajdonsagok
    public static int emberSzam = 0;
    //static - az osszes peldany ezen osztozik
    public static final boolean FERFI = false;
    public static final boolean NO = true;
    //final - nem valtozhat meg az erteke a deklaracio utan

    public String nev;
    //public - mindenhonnan lathato
    private boolean nem; //false ferfi, true no
    //private - csak az osztalyon belulrol lathato
    int szulEv = 1900; //Legyen 1900 - 2024 kozotti ertek
    //ha itt adok erteket, az a kezdoertek, amig valaki meg nem valtoztatja
    //ha nem irunk oda semmit - package friendly - a csomagon belulrol lathato

    protected Macska[] macskai; //ilyenkor ha nem allitjuk be, akkor null
    //  ^^ jelenlegi osztályban és ennek a leszármazottai látják

    //Viselkedesek

    //konstruktor - a memoriafoglalast intezi
    //a neve az osztaly nevevel megegyezik, nincs visszateresi erteke
    //default konstruktor - nincs parametere - ha nincs mas konstruktor,
    //akkor a Java automatikusan csinal egy ureset
    public Ember() {
        //ha itt nincs semmi, akkor is mukodik
        emberSzam++;
    }

    //parameteres konstruktor
    public Ember(String nev, boolean nem, int evszam) {
        this.nev = nev;
        this.nem = nem;
        //this.szulEv = evszam;
        this.setSzulEv(evszam); //ha van setter, sokszor megeri a konstruktorban is
        // ezt hivni
        //this - az aktualis peldanyra hivatkozik
        emberSzam++;
        //NO = false; //ezt nem lehet, mert final, azaz konstans
    }

    //getter - getValtozoneve - lekerdezhetjuk vele a valtozo erteket
    public int getSzulEv() {
        return this.szulEv;
    }

    //setter - setValtozoneve - beallithatjuk vele a valtozo erteket
    public void setSzulEv(int szulEv) {
        if(szulEv>=1900 && szulEv<=2024) this.szulEv = szulEv;
        else System.err.println("Nem jó évet adtál: " + szulEv);
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    //booleanoknal isValtozoneve a getter neve
    public boolean isNem() {
        return nem;
    }

    public void setNem(boolean nem) {
        this.nem = nem;
    }

    public Macska[] getMacskai() {
        return this.macskai;
    }

    public void setMacskai(Macska[] macskai) {
        this.macskai = macskai;
    }


    //etessen macskat
    public String etet(Macska kit) {
        return this.nev + " megetette " + kit.getNev() + " macskát. " +
                "A cica örül és dorombol";
    }


    //static fuggveny - az osztalyhoz kapcsolodik, nem a peldanyokhoz
    //akkor is meg lehet hivni, ha nincs egy peldany se
    //viszont nem tud nem static tulajdonsagokat felhasznalni
    //toString metodus - mi tortenjen ha szovegkent probaljuk kezelni
    public String toString() {
        //a toString nem kiirat, hanem szoveget visszaad!!!
        return this.nev + " egy " +
                ((this.nem)?"nő":"férfi") + ", akinek születési éve " +
                this.szulEv + ".";
    }



}
