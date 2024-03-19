public class CserelhetoFejuCsavarhuzo extends Csavarhuzo {

    private final int fejMeret;
    private boolean egyhornyuFej = true;
    private boolean phillipsFej = true;
    private boolean imbuszFej = true;


    public CserelhetoFejuCsavarhuzo(int meret, int fejMeret, Csavarfej csavarFej) {
        super(meret, csavarFej);
        this.fejMeret = fejMeret;

    }

    public void fejElhagy(String melyik) {
        switch (melyik) {
            case "egyhornyu" -> {
                this.egyhornyuFej = false;
            }
            case "phillips" -> {
                this.phillipsFej = false;
            }
            case "imbusz" -> {
                this.imbuszFej = false;
            }
        }
    }

    public boolean fejCsere(String melyikre) {

        if (super.getCsavarfej().name().equalsIgnoreCase(melyikre)) return false;

        switch (melyikre) {
            case "egyhornyu" -> {
                if (!this.egyhornyuFej) return false;
                super.csavarfej = Csavarfej.EGYHORNYU;
            }
            case "phillips" -> {
                if (!this.phillipsFej) return false;
                super.csavarfej = Csavarfej.PHILLIPS;
            }
            case "imbusz" -> {
                if (!this.imbuszFej) return false;
                super.csavarfej = Csavarfej.IMBUSZ;
            }
            default -> {
                return false;
            }
        }

        return true;

    }

    public int getMeret() {
        return super.getMeret() - this.fejMeret;
    }

}
