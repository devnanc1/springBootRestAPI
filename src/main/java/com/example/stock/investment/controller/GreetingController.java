package com.example.stock.investment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //component that contains routes of our app and what happens when users visit those apps
public class GreetingController {

    //Default method is a Get request
    @RequestMapping("/") //annotation that is built into the Spring Framework
    //this define one get endpoint, the home endpoint or home route. Ex. localhost:8080/
    public String getGreeting(){
        return "Hi it's me, I don't know anything ";
    }
}
