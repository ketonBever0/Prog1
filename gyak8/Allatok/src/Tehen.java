public class Tehen extends SzarazfoldiAllat implements Novenyevo {
    //  implements interfészt hív, többet is lehet ,-vel

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
        this.setJollakottsag(this.getJollakottsag() + 0.1);
    }
}
