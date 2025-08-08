package org.example.CustomerServiceGP.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressDto {
    private String apartment;
    private String floor;
    private String street;
    private String homeNumber;
    private String city;
    private String postalCode;
    private String country;
}

