package ru.fastdelivery.domain.exception;

public class TransportException extends RuntimeException {
    public TransportException(String message) {
        super(message);
    }
}