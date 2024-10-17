package com.example.spring_boot_crud.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class control {

    @GetMapping("/")
    public String greet(){
        return "its active on the port 8000";
    }
}
