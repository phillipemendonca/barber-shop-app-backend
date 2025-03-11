package br.com.project.barber_shop_app.exception;

public class EmailInUseException extends RuntimeException {

    public EmailInUseException(String message) {
        super(message);
    }

}