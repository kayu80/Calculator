package ru.fastdelivery.domain.common.price;

import java.math.BigDecimal;

public class PriceUtils {

    public static Price centsToRubles(long centsAmount) {
        return new Price(new BigDecimal(centsAmount).movePointLeft(2), new Currency("RUB"));
    }

    public static boolean areSameCurrency(Price first, Price second) {
        return first.currency().equals(second.currency());
    }

    public static String formatPrice(Price price) {
        return price.amount() + " " + price.currency().getCode();
    }
}