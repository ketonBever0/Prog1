public class ZeroDivisionException extends Exception {


    public ZeroDivisionException() {
        super("Nullával próbáltál osztani!");
    }

    public ZeroDivisionException(String message) {
        super(message);
    }
}
