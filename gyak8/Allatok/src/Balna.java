public class Balna extends ViziAllat implements Novenyevo, Ragadozo {
    public Balna(String nev, int ero, double jollakottsag) {
        super(nev, ero, jollakottsag);
    }

    public String hangotAd() {
        return "Bálnaének";
    }

    @Override
    public void eszik() {
        this.setEro(this.getEro() + 2);
    }

    @Override
    public void eszik(Allat kit) {
        if (this.getEro() > kit.getEro() + 2) {
            this.setEro(this.getEro() + 1);
            this.setJollakottsag(this.getJollakottsag() + 0.1);
        }
    }
}
