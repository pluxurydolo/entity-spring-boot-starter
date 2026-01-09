package com.pluxurydolo.entity.converter;

import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.assertj.core.api.Assertions.assertThat;

class InstantConverterTests {
    private static final InstantConverter CONVERTER = new InstantConverter();

    @Test
    void testConvertToDatabaseColumn() {
        Long result1 = CONVERTER.convertToDatabaseColumn(Instant.ofEpochSecond(1));
        Long result2 = CONVERTER.convertToDatabaseColumn(null);

        assertThat(result1)
            .isOne();
        assertThat(result2)
            .isNull();
    }

    @Test
    void testConvertToEntityAttribute() {
        Instant result1 = CONVERTER.convertToEntityAttribute(1L);
        Instant result2 = CONVERTER.convertToEntityAttribute(null);

        assertThat(result1)
            .isEqualTo(Instant.ofEpochSecond(1));
        assertThat(result2)
            .isNull();
    }
}
