package ru.fastdelivery.domain.common.weight;

public class SizeNormalizer {

    public static int roundUpToNearestMultiple(int size, int multiple) {
        return ((size + multiple - 1) / multiple) * multiple;
    }

    public static Weight normalizeWeight(Weight rawWeight) {
        // Предполагается, что масса груза должна быть округлена до ближайшего стандартного значения
        return new Weight(roundUpToNearestMultiple(rawWeight.grams.intValue(), 100)); // округлить до сотен граммов
    }
}