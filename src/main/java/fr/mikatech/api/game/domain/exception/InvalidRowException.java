package fr.mikatech.api.game.domain.exception;

public class InvalidRowException extends RuntimeException {
    public InvalidRowException(String message) {
        super(message);
    }
}
