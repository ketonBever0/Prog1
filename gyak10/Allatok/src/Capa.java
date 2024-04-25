public class Capa extends ViziAllat implements Ragadozo {


    public Capa(String nev, int ero, double jollakottsag) {
        super(nev, ero, jollakottsag);
    }

    public String hangotAd() {
        return "Tudum-tudum-tudumtudumtudum.";
    }

    @Override
    public void eszik(Allat kit) {
        this.setJollakottsag(getJollakottsag() + kit.getJollakottsag());
        this.setEro(this.getEro()+1);
    }
}
