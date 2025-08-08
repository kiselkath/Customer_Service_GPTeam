package org.example.CustomerServiceGP.dto;


import jakarta.validation.constraints.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {

    @NotBlank
    private String userId;

    @NotBlank
    private String name;

    @Email
    @NotBlank
    private String email;

    @Pattern(regexp = "^\\+?[0-9]{7,15}$", message = "Invalid mobile number")
    private String mobileNumber;

    @Past
    private String dateOfBirth; // Можно заменить на LocalDate, если будешь парсить

    private boolean vip;

    @NotNull
    private SizesDto sizes;

    @NotNull
    private AddressDto address;

}

