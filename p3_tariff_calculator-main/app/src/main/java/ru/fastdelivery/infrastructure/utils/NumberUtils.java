package ru.fastdelivery.infrastructure.utils;

public class NumberUtils {

    public static boolean isPositive(double number) {
        return number >= 0;
    }

    public static int roundToInt(double number) {
        return (int)Math.round(number);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}