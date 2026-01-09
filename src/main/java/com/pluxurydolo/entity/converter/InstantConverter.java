package com.pluxurydolo.entity.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.time.Instant;

@Converter(autoApply = true)
public class InstantConverter implements AttributeConverter<Instant, Long> {

    @Override
    public Long convertToDatabaseColumn(Instant value) {
        if (value == null) {
            return null;
        }

        return value.getEpochSecond();
    }

    @Override
    public Instant convertToEntityAttribute(Long value) {
        if (value == null) {
            return null;
        }

        return Instant.ofEpochSecond(value);
    }
}
