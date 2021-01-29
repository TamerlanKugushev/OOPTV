package exceptions;

public class InsufficientHeightException extends Exception {
    public InsufficientHeightException() {
        super();
    }

    public InsufficientHeightException(String message) {
        super(message);
    }
}
