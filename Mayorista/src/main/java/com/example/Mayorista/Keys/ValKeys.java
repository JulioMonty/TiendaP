package com.example.Mayorista.Keys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api")
public class ValKeys {

    @Autowired
    private ApKey apiKeyManager;

    @GetMapping("/protected-resource")
    public String protectedResource(@RequestHeader("API-KEY") String apiKey) {
        if (!apiKeyManager.isValidApiKey(apiKey)) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid API Key");
        }
        return "Access granted to protected resource.";
    }
}
