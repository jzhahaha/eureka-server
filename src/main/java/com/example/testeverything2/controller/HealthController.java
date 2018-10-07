package com.example.testeverything2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @RequestMapping("/health")
    public  String healthController(){
        return "health";
    }

    @RequestMapping(value = "/test")
    public String eurekaTestController(){
        return "eureka,test";
    }

    @RequestMapping(value = "/eurekaTest")
    public String eurekaController(){
        return "eureka";
    }

}
