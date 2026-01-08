package ru.fastdelivery.properties.coordinates;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "coordinates.range")
public class CoordinatesRange {

    private double minLatitude;
    private double maxLatitude;
    private double minLongitude;
    private double maxLongitude;
}