package com.example.demo.domain.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

    @GetMapping("/index")
    public String helloWorld(){
        return "HelloWorld";
    }
}
