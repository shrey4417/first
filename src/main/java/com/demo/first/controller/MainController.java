package com.demo.first.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping("health")
    public ResponseEntity<?> appHealthCheck(){
        System.out.println(">>Application health check api");
        return ResponseEntity.ok("Application Up");
    }
}
