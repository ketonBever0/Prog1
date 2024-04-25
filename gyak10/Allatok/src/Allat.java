//abstract - nem lehet peldanyositani
//ez akkor jo, ha a gyerekei miatt csinaljuk - vagy esetleg
//a static dolgai miatt

import java.util.Objects;

//implements Comparable<Allat> - ossze lehet hasonlitani masik allattal
//kell a compareTo(Allat masik) fuggveny!
public abstract class Allat implements Comparable<Allat> {

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
        if(jollakottsag < 0) jollakottsag = 0;
        else if(jollakottsag > 1) jollakottsag = 1;
        this.jollakottsag = jollakottsag;
    }

    //absztrakt fuggveny - nem adjuk meg a torzset,
    //de az osszes nem absztrakt leszarmazottjanak lesz ilyen
    //a nem absztrakt osztalynak nincs absztrakt fuggvenye
    public abstract String hangotAd();


    //Mikor tekintjuk egyezonek a ket allatot?
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Allat allat = (Allat) o;
        return this.nev.equals(allat.getNev());
    }

    //Mikor tekintjuk egyezonek a ket allatot?
    @Override
    public int hashCode() {
        return Objects.hash(nev);
    }

    //Mi tortenik ha a masik allathoz hasonlitjuk? -1 a this a kisebb, 0 egyenloek, 1 a this a nagyobb
    //A TreeSet es TreeMap eszerint rendezi oket
	//A kovetkezo ero szerint novekvo rendezes: 
    public int compareTo(Allat masik) {
        if(this.ero > masik.ero) return 1;
        else if(this.ero == masik.ero) return 0;
        else return -1;
//        - erő szerint

//        - ábécé szerint
//        return this.getNev().compareTo(masik.nev);
    }

    @Override
    public String toString() {
        return this.nev + " egy " + this.getClass().getName() +
                ", akinek " +
                "ereje " + this.ero + ", jóllakottsága " +
                this.jollakottsag;
    }
}
