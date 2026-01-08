package ru.fastdelivery.infrastructure.utils;

public class GeometryUtil {

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}