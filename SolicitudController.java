package com.example.Mayorista.Controllers;

import com.example.Mayorista.Models.SolicitudesModelo;
import com.example.Mayorista.Repositories.SolicitudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/solicitudes")
@CrossOrigin(origins = {"http://localhost", "https://tiendap-production-86e7.up.railway.app"}) // Configuración CORS global
public class SolicitudController {

    @Autowired
    private SolicitudRepo solicitudRepository;

    @PostMapping("/crearSolicitud")
    public ResponseEntity<String> crearSolicitud(
            @RequestParam String nombreSolicitante,
            @RequestParam int idProducto,
            @RequestParam int cantidadSolicitada) {

        // Validaciones
        if (nombreSolicitante == null || nombreSolicitante.isEmpty()) {
            return ResponseEntity.badRequest().body("El nombre del solicitante es obligatorio.");
        }

        if (idProducto <= 0 || cantidadSolicitada <= 0) {
            return ResponseEntity.badRequest().body("El ID del producto y la cantidad deben ser mayores a cero.");
        }

        // Crear un objeto de Solicitud
        SolicitudesModelo solicitud = new SolicitudesModelo();
        solicitud.setSolicitante(nombreSolicitante);
        solicitud.setID_Producto_Solicitado(idProducto);
        solicitud.setCantidad(cantidadSolicitada);
        solicitud.setEstatus("PENDIENTE");

        // Guardar en la base de datos
        try {
            solicitudRepository.save(solicitud);
            return ResponseEntity.ok("Solicitud creada exitosamente con ID: " + solicitud.getId());
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error al crear la solicitud: " + e.getMessage());
        }
    }
}
