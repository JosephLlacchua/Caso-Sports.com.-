package com.sports.platform.u202317002.athletes.domain.models.valueobjects;


import jakarta.persistence.Embeddable;

@Embeddable
public record AthleteSport(String sport) {
    public AthleteSport {
        if (sport == null || sport.isBlank()) {
            throw new IllegalArgumentException("Sport cannot be null or blank");
        }
    }
}
