package com.bumjin.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoBumjin2021Application {

    @GetMapping("/message")
    public String message() {
        return "Contrats! your app deployed sucessfully in azure";

    }
    public static void main(String[] args) {
        SpringApplication.run(SpringAzureDemoBumjin2021Application.class, args);
    }

}
