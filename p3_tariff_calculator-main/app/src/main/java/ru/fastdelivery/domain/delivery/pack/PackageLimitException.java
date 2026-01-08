package ru.fastdelivery.domain.delivery.pack;

public class PackageLimitException extends RuntimeException {
    public PackageLimitException(String message) {
        super(message);
    }
}