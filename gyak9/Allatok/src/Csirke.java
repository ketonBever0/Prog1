public class Csirke extends SzarazfoldiAllat implements Novenyevo, Ragadozo {
    public Csirke(String nev, int ero, double jollakottsag) {
        super(nev, ero, jollakottsag,2);
    }

    public Csirke(String nev, int ero, double jollakottsag, int labakSzama) {
        super(nev, ero, jollakottsag, labakSzama);
    }

    @Override
    public String hangotAd() {
        return "Kott-kott";
    }

    @Override
    public void eszik() {
        this.setJollakottsag(1);
    }

    @Override
    public void eszik(Allat kit) {
        if(this.getJollakottsag() < 0.5) {
            this.eszik();
        }
    }
}
