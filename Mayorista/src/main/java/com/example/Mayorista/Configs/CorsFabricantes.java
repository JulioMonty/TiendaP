package com.example.Mayorista.Configs;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CorsFabricantes {

    @CrossOrigin(origins = "https://tiendap-production-86e7.up.railway.app/")
    @GetMapping("/FabricantesPoint/FabricantesGuardado")
    public String getResource() {
        return "CORS habilitado para este endpoint";
    }
}
