//implements - megvalositja az interface-t
//mint az oroklodes, de csak fuggvenyeket iger
//vesszovel tobbet is lehet
public class Tehen extends SzarazfoldiAllat implements Novenyevo {


    public Tehen(String nev, int ero, double jollakottsag) {
        super(nev, ero, jollakottsag);
    }

    public Tehen(String nev, int ero, double jollakottsag, int labakSzama) {
        super(nev, ero, jollakottsag, labakSzama);
    }

    @Override
    public String hangotAd() {
        return "Múúúú";
    }

    @Override
    public void eszik() {
        this.setJollakottsag(this.getJollakottsag()+0.1);
    }
}
