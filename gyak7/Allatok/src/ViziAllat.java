public class ViziAllat extends Allat {


    public ViziAllat(String nev, int ero, double jollakottsag) {
        super(nev, ero, jollakottsag);
    }

    @Override
    public String hangotAd() {
        return "Víz alatt nem hallatszik a hangja.";
    }
}
