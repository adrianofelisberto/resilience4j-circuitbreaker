package com.example.resilience4jprojectb.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servico-b")
public class Controller {

    @GetMapping("item")
    public ResponseEntity<String> getItem() {
        return ResponseEntity.ok("resposta servico b");
    }

}
