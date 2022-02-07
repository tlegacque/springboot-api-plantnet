package com.tristan.pocproxytest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MyEndpointController {

    @GetMapping("/name")
    public ResponseEntity<String> getApiName() {
        return ResponseEntity.ok().body("POC PROXY");
    }
}
