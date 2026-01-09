package com.pluxurydolo.entity.config;

import com.pluxurydolo.entity.utils.UUIDGenerator;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class EntityAutoConfiguration {

    @Bean
    public UUIDGenerator uuidGenerator() {
        return new UUIDGenerator();
    }
}
