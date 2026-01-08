package ru.fastdelivery.domain.delivery.coordinates;

public class CoordinateValidator {

    public static void validateLatitude(double lat) {
        if (lat < -90 || lat > 90) {
            throw new IllegalArgumentException("Неверная широта.");
        }
    }

    public static void validateLongitude(double lon) {
        if (lon < -180 || lon > 180) {
            throw new IllegalArgumentException("Неверная долгота.");
        }
    }
}