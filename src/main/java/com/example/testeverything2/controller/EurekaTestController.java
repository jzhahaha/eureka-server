package com.example.testeverything2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaTestController {

    @RequestMapping("/eureka/test")
    public String eurekaTest(){
        return "eureka,test";
    }

}
