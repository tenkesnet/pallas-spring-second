package com.pallas.second.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pallas.second.model.Address;
import com.pallas.second.repository.IAddressRepository;
import com.pallas.util.model.Person;

@RestController
public class HomeController {
    @Autowired
    private IAddressRepository addresses;

    @Value("${path}")
    private String database;

    @GetMapping("/")
    public Iterable<Address> index() {
        return addresses.findAll();
    }

}
