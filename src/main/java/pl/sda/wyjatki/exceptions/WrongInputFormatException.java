package pl.sda.wyjatki.exceptions;

public class WrongInputFormatException extends Exception {
    public WrongInputFormatException(String message) {
        super(message);
    }

    public WrongInputFormatException() {
    }

    public void getMessage(String message) {
        System.out.println(message);
    }
}
