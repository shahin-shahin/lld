package com.shahin.lld.creationaldesionpattern.builderdesignpattern.anotherexample;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        // Simulate saving user
        return "User registered: " + user.getUsername();
    }

    @GetMapping("/sample")
    public User getSampleUser() {
        // Using builder pattern manually
        return User.builder()
                .username("john_doe")
                .email("john@example.com")
                .password("secure123")
                .build();
    }
}

