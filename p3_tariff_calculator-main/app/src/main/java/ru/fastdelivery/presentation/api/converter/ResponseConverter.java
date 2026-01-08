package ru.fastdelivery.presentation.converter;

import ru.fastdelivery.presentation.api.response.CalculatePackagesResponse;
import ru.fastdelivery.usecase.ResultDTO;

public class ResponseConverter {

    public static CalculatePackagesResponse convertFromResult(ResultDTO result) {

        return new CalculatePackagesResponse(result.getTotalPrice(), result.getCurrencyCode());
    }
}