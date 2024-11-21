package com.example.Mayorista.Keys;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ApKey {

    private Map<String, String> apiKeys = new HashMap<>();

    public String generateApiKey(String clientName) {
        String apiKey = java.util.UUID.randomUUID().toString();
        apiKeys.put(clientName, apiKey);
        return apiKey;
    }

    public boolean isValidApiKey(String apiKey) {
        return apiKeys.containsValue(apiKey);
    }
}

