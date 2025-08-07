package org.example.CustomerServiceGP.service;

import org.example.CustomerServiceGP.model.Address;
import org.example.CustomerServiceGP.model.Customer;
import org.example.CustomerServiceGP.model.Sizes;
import org.example.CustomerServiceGP.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

/**
 * Service class that contains the business logic for customer-service management.
 */


@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    /**
     * Create new customer
     */
    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }

    /**
     * Find customer by userId
     */
    public Optional<Customer> getById(String userId) {
        return customerRepository.findById(userId);
    }

    /**
     * Update customer's Name
     */
    public void updateName(String userId, String newName) {
        Customer customer = customerRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
        customer.setName(newName);
        customerRepository.save(customer);
    }

    /**
     * Update customer's DateOfBirth
     */
    public void updateDateOfBirth(String userId, LocalDate newDateOfBirth) {
        Customer customer = customerRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
        customer.setDateOfBirth(newDateOfBirth);
        customerRepository.save(customer);
    }

    /**
     * Update customer's Email
     */
    public void updateEmail(String userId, String newEmail) {
        Customer customer = customerRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
        customer.setEmail(newEmail);
        customerRepository.save(customer);
    }

    /**
     * Update customer's mobileNumber
     */
    public void updateMobileNumber(String userId, String newMobileNumber) {
        Customer customer = customerRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
        customer.setEmail(newMobileNumber);
        customerRepository.save(customer);
    }

    /**
     * Update customer's Address
     */
    public void updateAddress(String userId, Address newAddress) {
        Customer customer = customerRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
        customer.setAddress(newAddress);
        customerRepository.save(customer);
    }

    /**
     * Update customer's VIP-status
     */
    public void updateVipStatus(String userId, boolean isVip) {
        Customer customer = customerRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
        customer.setVip(isVip);
        customerRepository.save(customer);
    }

    /**
     * Update customer Sizes
     */
    public void updateSizes(String userId, Sizes newSizes) {
        Customer customer = customerRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
        customer.setSizes(newSizes);
        customerRepository.save(customer);
    }
}

