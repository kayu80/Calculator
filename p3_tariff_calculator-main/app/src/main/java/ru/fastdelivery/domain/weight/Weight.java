package ru.fastdelivery.domain.common.weight;

import java.math.BigInteger;
import java.math.BigDecimal;
import java.math.RoundingMode;

public record Weight(BigInteger grams) {
    public Weight {
        if (grams.signum() < 0) {
            throw new IllegalArgumentException("Масса не может быть отрицательной.");
        }
    }

    public BigDecimal toKilograms() {
        return new BigDecimal(grams).divide(BigDecimal.valueOf(1000), 100, RoundingMode.HALF_UP);
    }

    public Weight add(Weight another) {
        return new Weight(grams.add(another.grams));
    }

    public boolean lessThan(Weight another) {
        return grams.compareTo(another.grams) < 0;
    }
}