package com.sports.platform.u202317002.athletes.domain.models.valueobjects;

import jakarta.persistence.Embeddable;

@Embeddable
public record CityAddress(String address , String city) {
    public CityAddress(){this(null,null); }
    public CityAddress {
        if (address == null ) {
            throw new IllegalArgumentException("Address cannot be null");
        }
        if (city == null ) {
            throw new IllegalArgumentException("City cannot be null ");
        }
    }
    public String fullAddress() {
        return String.format("%s %s", address, city);
    }
}
