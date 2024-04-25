public class NemSzeretiException extends Exception {
    private final Jatek melyikJatekot;

    public NemSzeretiException(Jatek melyikJatekot) {
        super(String.format("A jatekos nem szereti a %s jatekot.", melyikJatekot.getNev()));
        this.melyikJatekot = melyikJatekot;
    }

    public Jatek getMelyikJatekot() {
        return melyikJatekot;
    }
}
