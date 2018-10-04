package com.example.testeverything2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @RequestMapping(value = {"", "/health"})
    public  String healthController(){
        return "health";
    }

}
