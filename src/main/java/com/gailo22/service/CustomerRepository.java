package com.gailo22.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gailo22.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}