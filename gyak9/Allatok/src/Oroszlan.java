public class Oroszlan extends SzarazfoldiAllat implements Ragadozo {
    public Oroszlan(String nev, int ero, double jollakottsag) {
        super(nev, ero, jollakottsag);
    }

    public Oroszlan(String nev, int ero, double jollakottsag, int labakSzama) {
        super(nev, ero, jollakottsag, labakSzama);
    }

    @Override
    public String hangotAd() {
        return "Nagy miau";
    }

    @Override
    public void eszik(Allat kit) {
        if(this.getEro() > kit.getEro()) {
            this.setJollakottsag(this.getJollakottsag()+0.1);
            this.setEro(this.getEro() + 1);
        }
    }
}
