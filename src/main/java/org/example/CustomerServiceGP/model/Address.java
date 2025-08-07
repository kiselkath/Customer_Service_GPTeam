package org.example.CustomerServiceGP.model;

import jakarta.persistence.Embeddable;

/**
 * Represents information about customer's Address
 */
@Embeddable
public class Address {

    private String apartment;
    private String floor;

    private String street;
    private String homeNumber;
    private String city;
    private String postalCode;
    private String country;

    public Address() {
        // JPA
    }

    public Address(String street, String homeNumber, String city, String postalCode, String country) {
        this.street = street;
        this.homeNumber = homeNumber;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
    }

    public String getApartment() {
        return apartment;
    }

    public String getFloor() {
        return floor;
    }

    public String getStreet() {
        return street;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }
}
