package ru.fastdelivery.domain.delivery.shipment;

import java.util.List;

public record Route(List<String> waypoints, double totalDistanceKm) {
    public Route {
        if (waypoints.size() < 2) {
            throw new IllegalArgumentException("Маршрут должен иметь минимум две точки.");
        }
    }
}