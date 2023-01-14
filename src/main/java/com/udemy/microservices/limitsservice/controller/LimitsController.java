package com.udemy.microservices.limitsservice.controller;

import com.udemy.microservices.limitsservice.bean.Limits;
import com.udemy.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/limits")
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping
    public Limits getLimits() {
        return Limits.builder().minimum(configuration.getMinimum()).maximum(configuration.getMaximum()).build();
//        return Limits.builder().minimum(1).maximum(1000).build();
    }
}
