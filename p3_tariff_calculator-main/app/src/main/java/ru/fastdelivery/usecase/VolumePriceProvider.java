package ru.fastdelivery.usecase;

import ru.fastdelivery.domain.common.price.Price;
import ru.fastdelivery.domain.delivery.shipment.Shipment;

public class VolumePriceProvider {

    public Price calculateVolumeCost(final Shipment shipment) {

        return new Price(shipment.getVolume(), "RUB");
    }
}