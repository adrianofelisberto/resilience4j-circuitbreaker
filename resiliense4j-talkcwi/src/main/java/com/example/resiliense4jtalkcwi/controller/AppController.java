package com.example.resiliense4jtalkcwi.controller;

import com.example.resiliense4jtalkcwi.models.AppResponse;
import com.example.resiliense4jtalkcwi.services.AdpterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("my-app")
public class AppController {

    @Autowired
    AdpterService adpterService;

    @GetMapping("item-servicoB")
    public ResponseEntity<AppResponse> getItemServicoB() {
        return ResponseEntity.ok(adpterService.buscarItemServicoB());
    }

}
