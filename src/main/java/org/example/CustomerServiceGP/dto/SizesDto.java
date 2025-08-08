package org.example.CustomerServiceGP.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SizesDto {
    private String topSize;
    private String bottomSize;
    private int shoeSize;
}

