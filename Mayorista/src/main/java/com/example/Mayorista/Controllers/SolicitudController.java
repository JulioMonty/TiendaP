package com.example.Mayorista.Controllers;

import com.example.Mayorista.Models.SolicitudModelo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/solicitudes")
public class SolicitudController {

    @PostMapping
    public ResponseEntity<String> recibirSolicitud(@RequestBody SolicitudModelo solicitudModelo) {
        // Aquí puedes procesar la solicitudModelo y guardarla en la base de datos
        System.out.println("Solicitud recibida: " + solicitudModelo);

        // Devuelve una respuesta adecuada
        return new ResponseEntity<>("Solicitud recibida correctamente", HttpStatus.CREATED);
    }
}
