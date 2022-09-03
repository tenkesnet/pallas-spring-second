package com.pallas.second.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pallas.second.repository.IAddressRepository;

@Controller
public class HomeController {

    @Autowired
    private IAddressRepository addresses;

    @GetMapping("/")
    public String index(Model m) {
        m.addAttribute("addresses", addresses.findAll());
        return "index";
    }
}
