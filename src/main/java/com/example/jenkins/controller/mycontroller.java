package com.example.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class mycontroller {
    
    @RequestMapping("/")
    public String hel(){
        return "hello world";
    }
}
