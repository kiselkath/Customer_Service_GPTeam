package org.example.CustomerServiceGP.controller;

import org.example.CustomerServiceGP.dto.response.CustomerInfoResponse;
import org.example.CustomerServiceGP.model.Address;
import org.example.CustomerServiceGP.model.Customer;
import org.example.CustomerServiceGP.model.Sizes;
import org.example.CustomerServiceGP.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Optional;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    // Создание нового пользователя
    @PostMapping
    public ResponseEntity<Customer> registerCustomer(@RequestBody Customer customer) {
        Customer created = customerService.create(customer);
        return ResponseEntity.ok(created);
    }

    // Получение пользователя по ID
    @GetMapping("/{userId}")
    public ResponseEntity<CustomerInfoResponse> getCustomer(@PathVariable String userId) {
        return ResponseEntity.ok(customerService.getCustomerInfo(userId));
    }


    // Обновление имени
    @PutMapping("/{userId}/name")
    public ResponseEntity<Void> updateName(@PathVariable String userId, @RequestBody String newName) {
        customerService.updateName(userId, newName);
        return ResponseEntity.ok().build();
    }

    // Обновление даты рождения
    @PutMapping("/{userId}/dob")
    public ResponseEntity<Void> updateDateOfBirth(@PathVariable String userId, @RequestBody LocalDate dob) {
        customerService.updateDateOfBirth(userId, dob);
        return ResponseEntity.ok().build();
    }

    // Обновление email
    @PutMapping("/{userId}/email")
    public ResponseEntity<Void> updateEmail(@PathVariable String userId, @RequestBody String email) {
        customerService.updateEmail(userId, email);
        return ResponseEntity.ok().build();
    }

    // Обновление телефона
    @PutMapping("/{userId}/mobile")
    public ResponseEntity<Void> updateMobileNumber(@PathVariable String userId, @RequestBody String phone) {
        customerService.updateMobileNumber(userId, phone);
        return ResponseEntity.ok().build();
    }

    // Обновление адреса
    @PutMapping("/{userId}/address")
    public ResponseEntity<Void> updateAddress(@PathVariable String userId, @RequestBody Address address) {
        customerService.updateAddress(userId, address);
        return ResponseEntity.ok().build();
    }

    // Обновление VIP-статуса
    @PutMapping("/{userId}/vip")
    public ResponseEntity<Void> updateVip(@PathVariable String userId, @RequestBody boolean isVip) {
        customerService.updateVipStatus(userId, isVip);
        return ResponseEntity.ok().build();
    }

    // Обновление размеров
    @PutMapping("/{userId}/sizes")
    public ResponseEntity<Void> updateSizes(@PathVariable String userId, @RequestBody Sizes sizes) {
        customerService.updateSizes(userId, sizes);
        return ResponseEntity.ok().build();
    }
}
