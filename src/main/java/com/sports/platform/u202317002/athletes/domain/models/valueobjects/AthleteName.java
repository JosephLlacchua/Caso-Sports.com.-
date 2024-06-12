package com.sports.platform.u202317002.athletes.domain.models.valueobjects;


import jakarta.persistence.Embeddable;

@Embeddable
public record AthleteName(String lastName, String firstName) {
    public  AthleteName(){this(null,null); }
    public AthleteName {
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("First name cannot be null or blank");
        }
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("Lat name cannot be null or blank");
        }
    }
    public String fullName() {
        return String.format("%s %s", lastName, firstName);
    }
}
