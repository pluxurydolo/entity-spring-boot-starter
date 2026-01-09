package com.pluxurydolo.entity.utils;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class UUIDGeneratorTests {
    private static final UUIDGenerator GENERATOR = new UUIDGenerator();

    @Test
    void testGenerate() {
        UUID result = GENERATOR.generate();

        assertDoesNotThrow(() -> UUID.fromString(result.toString()));
    }
}
