package br.com.project.barber_shop_app.exception;

public class ScheduleInUseException extends RuntimeException {

    public ScheduleInUseException(String message) {
        super(message);
    }

}
