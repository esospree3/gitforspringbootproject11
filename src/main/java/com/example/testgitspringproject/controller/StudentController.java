package com.example.testgitspringproject.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/welcome")
    public String etMessage() {
        return "Welcome to git from springboot";
    }
}
