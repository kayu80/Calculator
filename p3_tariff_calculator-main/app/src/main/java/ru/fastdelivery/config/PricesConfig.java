package ru.fastdelivery.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="prices")
@Data
public class PricesConfig {

    private Double costPerKG;
    private Double costPerCubicMeter;
    private Double minimumShippingFee;
    private Long minimumDistanceKM;
}