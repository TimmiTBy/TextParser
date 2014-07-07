package com.epam.textparser.exception;

public class TechnicalException extends Exception {

    public TechnicalException(Exception exception) {
        super(exception);
    }

    public TechnicalException(String message) {
        super(message);
    }

    public TechnicalException(String message, Exception exception) {
        super(message, exception);
    }

}
