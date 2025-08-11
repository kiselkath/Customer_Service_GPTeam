package org.example.CustomerServiceGP.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO для передачи минимальной информации о клиенте другим сервисам.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerInfoResponse {
    private String userId;
    private String name;
    private boolean vip;
}
