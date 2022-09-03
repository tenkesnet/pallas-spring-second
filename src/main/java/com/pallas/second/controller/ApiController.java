package com.pallas.second.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pallas.second.model.Address;
import com.pallas.second.repository.IAddressRepository;

@RestController
public class ApiController {
    @Autowired
    private IAddressRepository addresses;

    @Value("${path}")
    private String database;

    @GetMapping("/address")
    public Iterable<Address> index() {
        return addresses.findAll();
    }

    @GetMapping("/address/{id}")
    public Optional<Address> getAddress(@PathVariable Long id) {
        return addresses.findById(id);
    }

}
