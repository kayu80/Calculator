package ru.fastdelivery.domain.delivery.pack;

import ru.fastdelivery.domain.common.weight.Weight;

public record Pack(Weight weight, String contentDescription) {
    public Pack {
        if (weight.lessThan(Weight.ofBigInteger(BigInteger.ZERO))) {
            throw new IllegalArgumentException("Вес упаковки не может быть отрицательным.");
        }
    }
}