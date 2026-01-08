package ru.fastdelivery.infrastructure.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerFactory {

    public static Logger getLogger(Class<?> clazz) {
        return org.slf4j.LoggerFactory.getLogger(clazz);
    }
}