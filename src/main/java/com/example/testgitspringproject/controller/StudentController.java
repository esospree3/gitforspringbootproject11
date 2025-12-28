package com.example.testgitspringproject.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/welcome")
    public String getMessage() {
        System.out.println("from getMessage() of StudentController java class");
        return "Welcome to git from spring boot project111";
    }
}
