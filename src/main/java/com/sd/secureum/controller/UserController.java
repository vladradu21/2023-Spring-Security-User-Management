package com.sd.secureum.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    @GetMapping
    public String getUser() {
        return "Hello World";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String getAdmin() {
        return "Hello Admin";
    }
}