public class Medve extends SzarazfoldiAllat implements Ragadozo, Novenyevo {

    public Medve(String nev, int ero, double jollakottsag) {
        super(nev, ero, jollakottsag);
    }

    public Medve(String nev, int ero, double jollakottsag, int labakSzama) {
        super(nev, ero, jollakottsag, labakSzama);
    }

    @Override
    public String hangotAd() {
        return "Brumm brumm";
    }

    @Override
    public void eszik() {
        this.setJollakottsag(this.getJollakottsag() + (1 - this.getJollakottsag())/2 );
    }

    @Override
    public void eszik(Allat kit) {
        if (this.getJollakottsag() * this.getEro() > kit.getEro() * kit.getJollakottsag()) {
            eszik();
        }
    }
}
