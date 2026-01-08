package ru.fastdelivery.presentation.converter;

import ru.fastdelivery.presentation.api.request.CalculatePackagesRequest;
import ru.fastdelivery.usecase.PackageDTO;

public class RequestConverter {

    public static PackageDTO convertFromRequest(CalculatePackagesRequest request) {
        // Конвертирование данных из запроса в внутреннюю модель данных
        return new PackageDTO.Builder()
                .withPackages(request.getPackages())
                .build();
    }
}