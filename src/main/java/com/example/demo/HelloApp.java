package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class HelloApp {

    @Value("${app.message:Default - No ConfigMap found}")
    private String message;

    @Value("${secret.username:No-Secret}")
    private String secretUser;

    @GetMapping("/hello")
    public String hello() {
        return "ConfigMap message: " + message + " | Secret user: " + secretUser;
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloApp.class, args);
    }
}


