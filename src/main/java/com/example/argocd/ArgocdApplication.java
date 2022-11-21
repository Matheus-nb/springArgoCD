package com.example.argocd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ArgocdApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArgocdApplication.class, args);
    }


    @GetMapping("/")
    public String index() {
        return "FIZ DAR BOM!";
    }
}
