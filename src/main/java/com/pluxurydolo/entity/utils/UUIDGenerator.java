package com.pluxurydolo.entity.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

import static java.util.UUID.randomUUID;

public class UUIDGenerator {
    private static final Logger LOGGER = LoggerFactory.getLogger(UUIDGenerator.class);

    public UUID generate() {
        UUID uuid = randomUUID();
        LOGGER.info("xhhk Сгенерированный UUID: {}", uuid);
        return uuid;
    }
}
