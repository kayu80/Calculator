package ru.fastdelivery.usecase;

import lombok.RequiredArgsConstructor;
import ru.fastdelivery.domain.common.price.Price;
import ru.fastdelivery.domain.delivery.shipment.Shipment;

@RequiredArgsConstructor
public class TariffCalculateUseCase {

    private final WeightPriceProvider weightPriceProvider;
    private final VolumePriceProvider volumePriceProvider;
    private final DistanceCalculator distanceCalculator;

    public Price calculate(final Shipment shipment) {

        return new Price(volumePriceProvider.calculateVolumeCost(shipment),
                weightPriceProvider.calculateWeightCost(shipment),
                distanceCalculator.calculateDistanceFactor(shipment));
    }
}