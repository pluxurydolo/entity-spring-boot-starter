package com.pluxurydolo.entity.config;

import com.pluxurydolo.entity.util.UUIDGenerator;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.hibernate.autoconfigure.HibernatePropertiesCustomizer;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class EntityAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public UUIDGenerator uuidGenerator() {
        return new UUIDGenerator();
    }

    @Bean
    public HibernatePropertiesCustomizer ormXmlMappingCustomizer() {
        return properties -> {
            properties.put("hibernate.jpa.compliance.proxy", true);
            properties.put("hibernate.jpa.compliance.query", true);
            properties.put("jakarta.persistence.validation.mode", "NONE");
        };
    }
}
