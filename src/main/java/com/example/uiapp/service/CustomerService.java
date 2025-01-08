package com.example.uiapp.service;


import com.example.uiapp.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private List<Customer> customers = new ArrayList<>();
    private int customerId = 1;

    public List<Customer> getAllCustomers() {
        return customers;
    }

    public Customer getCustomerById(int id) {
        Optional<Customer> customer = customers.stream().filter(c -> c.getId() == id).findFirst();
        return customer.orElse(null);
    }

    public Customer createCustomer(Customer customer) {
        customer.setId(customerId++);
        customers.add(customer);
        return customer;
    }

    public Customer updateCustomer(int id, Customer updatedCustomer) {
        Customer existingCustomer = getCustomerById(id);
        if (existingCustomer != null) {
            existingCustomer.setName(updatedCustomer.getName());
            existingCustomer.setAddress(updatedCustomer.getAddress());
            existingCustomer.setAge(updatedCustomer.getAge());
            return existingCustomer;
        }
        return null;
    }

    public boolean deleteCustomer(int id) {
        return customers.removeIf(customer -> customer.getId() == id);
    }
}
