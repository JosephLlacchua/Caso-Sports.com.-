package com.sports.platform.u202317002.athletes.domain.models.commands;

import java.util.Date;

public record CreateAthleteCommand (
        String lastName,
        String firstName,
        String sport,
        String address,
        String city,
        Date birthDate) {
}
