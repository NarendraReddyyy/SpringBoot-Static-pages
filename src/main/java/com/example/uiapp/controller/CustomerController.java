package com.example.uiapp.controller;

import com.example.uiapp.model.Customer;
import com.example.uiapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/all")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable int id) {
        return customerService.getCustomerById(id);
    }

    @PostMapping("/create")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable int id, @RequestBody Customer customer) {
        Customer updatedCustomer = customerService.updateCustomer(id, customer);
        return updatedCustomer != null ? ResponseEntity.ok(updatedCustomer) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable int id) {
        boolean isDeleted = customerService.deleteCustomer(id);
        return isDeleted ? ResponseEntity.ok("Customer deleted") : ResponseEntity.notFound().build();
    }
}
