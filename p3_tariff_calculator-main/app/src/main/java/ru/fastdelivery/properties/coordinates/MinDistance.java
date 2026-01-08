package ru.fastdelivery.properties.coordinates;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "min-distance")
public class MinDistance {

    private double km;
}