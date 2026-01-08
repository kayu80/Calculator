package ru.fastdelivery.domain.delivery.shipment;

import ru.fastdelivery.domain.delivery.pack.Pack;
import ru.fastdelivery.domain.common.weight.Weight;

import java.util.List;

public record Shipment(List<Pack> packages, String originAddress, String destinationAddress) {
    public Shipment {
        if (packages.size() == 0) {
            throw new IllegalArgumentException("Груз не может быть пустым.");
        }
    }

    public Weight totalWeight() {
        return packages.stream()
                .map(Pack::weight)
                .reduce(Weight::add)
                .orElseThrow(() -> new IllegalStateException("Ошибка при расчёте общего веса."));
    }
}