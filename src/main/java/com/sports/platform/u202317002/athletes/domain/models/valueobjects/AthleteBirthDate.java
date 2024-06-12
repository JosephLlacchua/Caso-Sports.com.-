package com.sports.platform.u202317002.athletes.domain.models.valueobjects;


import jakarta.persistence.Embeddable;

import java.util.Date;

@Embeddable
public record AthleteBirthDate(Date birthDate) {
    public AthleteBirthDate() { this(null); }

    public AthleteBirthDate {
        if (birthDate == null) {
            throw new IllegalArgumentException("Birth date cannot be null");
        }
        // Validate the birthdate is before January 1, 2013
        if (birthDate.after(new Date(113, 0, 1))) {
            throw new IllegalArgumentException("Athlete must be born before 2013");
        }
    }

    public Date value() {
        return birthDate;
    }
}
