package ru.fastdelivery.domain.common.currency;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CurrencyFactory {

    private final CurrencyPropertiesProvider propertiesProvider;

    public Currency create(String code) {
        if (code == null || !propertiesProvider.isAvailable(code)) {
            throw new IllegalArgumentException("Недопустимый код валюты: " + code);
        }
        return new Currency(code);
    }
}