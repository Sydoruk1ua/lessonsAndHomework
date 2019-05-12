package com.sydoruk1ua.exception;

public class EmaiNotValidException extends RuntimeException {
    public EmaiNotValidException(String message) {
        super(message);
    }

    public EmaiNotValidException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmaiNotValidException() {
    }
}
