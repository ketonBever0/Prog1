public class TulSokUtasException extends Exception {

    private int helyhiany;


    public TulSokUtasException(String message, int helyhiany) {
        super("Nincs hely!");
        this.helyhiany = helyhiany;
    }

    public int getHelyhiany() {
        return helyhiany;
    }
}
