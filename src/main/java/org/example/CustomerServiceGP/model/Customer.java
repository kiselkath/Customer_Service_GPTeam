package org.example.CustomerServiceGP.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Map;

/**
 * Represents a customer service
 * Includes all information about customer
 */

@Entity
public class Customer {
    @Id
    private String userId;

    private String name;
    private String email;
    private String mobileNumber;
    private LocalDate dateOfBirth;

    private boolean isVip;

    @Embedded
    private Sizes sizes;

    @Embedded
    private Address address;

    @ElementCollection
    private Map<String, String> preferences; //women fashion or mens or kids

}
