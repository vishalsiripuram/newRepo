package com.example.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class mycontroller {
    
    @RequestMapping("/hello")
    public String hel(){
        return "hello java1.8 world";
    }
}
