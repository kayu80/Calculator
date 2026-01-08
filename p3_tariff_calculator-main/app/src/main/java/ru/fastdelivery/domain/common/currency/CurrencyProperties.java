package ru.fastdelivery.domain.common.currency;

import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties("currency")
@Setter
public class CurrencyProperties implements CurrencyPropertiesProvider {

    private List<String> availableCurrencies;

    @Override
    public boolean isAvailable(String code) {
        return availableCurrencies.contains(code);
    }
}