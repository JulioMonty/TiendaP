package com.example.Mayorista.Controllers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

public class PuntosVentasCon {
    @RestController
    @RequestMapping("/api/solicitudes")
    public class SolicitudController {

        @PostMapping("/crearPunto")
        public ResponseEntity<String> crearSolicitud(
                @RequestParam String nombreSolicitante,
                @RequestParam int idProducto,
                @RequestParam int cantidadSolicitada) {

            // Simulación de procesamiento de la solicitud
            String respuesta = String.format(
                    "Solicitud creada exitosamente:\nINombre del solicitante: %s\nID del Producto: %d\nCantidad solicitada: %d",
                     nombreSolicitante, idProducto, cantidadSolicitada
            );

            return ResponseEntity.ok(respuesta);
        }
    }

}
