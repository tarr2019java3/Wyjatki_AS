package pl.sda.wyjatki.exceptions;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException() {

    }

    public InvalidAgeException(String message) {
        super(message);
    }

    public void getMessage(String message) {
        System.out.println(message);
    }
}
