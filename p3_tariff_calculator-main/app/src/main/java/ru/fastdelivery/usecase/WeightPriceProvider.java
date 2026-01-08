package ru.fastdelivery.usecase;

import ru.fastdelivery.domain.common.price.Price;
import ru.fastdelivery.domain.delivery.shipment.Shipment;

public class WeightPriceProvider {

    public Price calculateWeightCost(final Shipment shipment) {

        return new Price(shipment.getWeight(), "RUB");
    }
}