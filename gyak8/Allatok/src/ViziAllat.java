public abstract class ViziAllat extends Allat {


    public ViziAllat(String nev, int ero, double jollakottsag) {
        super(nev, ero, jollakottsag);
    }

    @Override
    public String hangotAd() {
        return "A víz alatt nem hallatszik.";
    }
}
