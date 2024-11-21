package com.example.Mayorista.Configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@Configuration
public class Cors {

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.setAllowedOrigins(Arrays.asList("https://tiendap-production-86e7.up.railway.app")); // Sin barra final
        config.setAllowedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization"));
        config.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        // Rutas con barras iniciales
        source.registerCorsConfiguration("/VentaPoint/VentaGuardada", config);
        source.registerCorsConfiguration("/FabricantesPoint/FabricantesGuardado", config);
        source.registerCorsConfiguration("/ProductosPoint/ProductosGuardado", config);

        return new CorsFilter(source);
    }
}

