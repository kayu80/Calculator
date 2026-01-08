package ru.fastdelivery.domain.common.price;

import ru.fastdelivery.domain.common.currency.Currency;

import java.math.BigDecimal;

public record Price(BigDecimal amount, Currency currency) {
    public Price {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Сумма не может быть отрицательной.");
        }
    }

    public Price multiply(BigDecimal factor) {
        return new Price(amount.multiply(factor), currency);
    }

    public Price add(Price other) {
        if (!this.currency.equals(other.currency)) {
            throw new IllegalArgumentException("Нельзя складывать суммы в разных валютах.");
        }
        return new Price(this.amount.add(other.amount), currency);
    }

    public boolean lessThan(Price other) {
        return this.amount.compareTo(other.amount) < 0 && this.currency.equals(other.currency);
    }
}