package ru.fastdelivery.properties.prices;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "prices.rubles")
public class PricesRublesProperties {

    private double perKgRate;
    private double perCubicMeterRate;
    private double minimumDeliveryCost;
}