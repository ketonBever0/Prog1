public class Csavarhuzo {

    private int meret;
    protected Csavarfej csavarfej;

    public Csavarhuzo(int meret, Csavarfej fej) {
        this.meret = meret;
        this.csavarfej = fej;
    }

    public int getMeret() {
        return this.meret;
    }

    public void setMeret(int meret) {
        this.meret = meret;
    }

    public Csavarfej getCsavarfej() {
        return this.csavarfej;
    }

    //    @Override
    public String toString() {
        return switch (this.csavarfej) {
            case EGYHORNYU -> "hagyomanyos feju csavarhuzo";
            case PHILLIPS -> "csillagfeju csavarhuzo";
            case IMBUSZ -> "imbuszfeju csavarhuzo";
        };
    }
}
