package com.sports.platform.u202317002.athletes.domain.models.commands;

public record CreateAthleteCommand (String lastName, String firstName, String sport, String address, String city) {
    public CreateAthleteCommand {
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("First name cannot be null or blank");
        }
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("Lat name cannot be null or blank");
        }
        if (sport == null || sport.isBlank()) {
            throw new IllegalArgumentException("Sport cannot be null or blank");
        }
        if (address == null ) {
            throw new IllegalArgumentException("Address cannot be null");
        }
        if (city == null ) {
            throw new IllegalArgumentException("City cannot be null ");
        }
    }
}
