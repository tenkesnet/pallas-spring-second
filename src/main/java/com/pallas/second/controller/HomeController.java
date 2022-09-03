package com.pallas.second.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pallas.util.model.Person;

@RestController
public class HomeController {

    private Person ember;

    @Autowired
    public void setEmber(Person ember) {
        this.ember = ember;
    }

    @GetMapping("/")
    public String index() {
        ember.setMessage("Legyen ez az üzenet");
        // m.addAttribute("message", ember.getMessage());
        return ember.getMessage();
    }

}
