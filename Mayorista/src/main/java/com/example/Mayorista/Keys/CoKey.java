package com.example.Mayorista.Keys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CoKey {

    @Autowired
    private ApKey apiKeyManager;

    public void generateAndPrintApiKey(String clientName) {
        String apiKey = apiKeyManager.generateApiKey(clientName);
        System.out.println("Generated API Key for " + clientName + ": " + apiKey);
    }
}

