package com.loiane.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin(origins = {"https://crud-angular-exmo.onrender.com", "localhost:8081"})
@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @GetMapping
     public String hello(){
        return "Hello, World";
    }
    
}
