package com.pluxurydolo.entity.entity.base;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;

import java.time.Instant;

import static java.time.Instant.now;
import static java.time.temporal.ChronoUnit.SECONDS;

@MappedSuperclass
public abstract class AbstractEntity {

    @Column
    private Instant createdAt;

    @Column
    private Instant updatedAt;

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    @PrePersist
    public void prePersist() {
        createdAt = now().truncatedTo(SECONDS);
        updatedAt = now().truncatedTo(SECONDS);
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
            "createdAt=" + createdAt +
            ", updatedAt=" + updatedAt +
            '}';
    }
}
