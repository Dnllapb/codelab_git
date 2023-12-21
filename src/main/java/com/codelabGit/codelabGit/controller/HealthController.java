package com.codelabGit.codelabGit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/v1/name")
public class HealthController {
    @GetMapping
    public String name()
    {
        return "Daniela ";
    }

}
