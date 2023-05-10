package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {

    @Value("${coach.name}")
    private String coachName;

    @GetMapping("/")
    public String myFirstApi(){
        return "Hello API Spring Boot "+coachName;
    }
}
