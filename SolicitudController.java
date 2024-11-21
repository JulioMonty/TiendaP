package com.example.Mayorista.Controllers;
import com.example.Mayorista.Models.SolicitudesModelo;
import com.example.Mayorista.Repositories.SolicitudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/solicitudes")
public class SolicitudController {

    @Autowired
    private SolicitudRepo solicitudRepository;

    @PostMapping("/crearSolicitud")
    public ResponseEntity<String> crearSolicitud(
            @RequestParam String nombreSolicitante,
            @RequestParam int idProducto,
            @RequestParam int cantidadSolicitada) {

        // Crear un objeto de Solicitud
        SolicitudesModelo solicitud = new SolicitudesModelo();
        solicitud.setSolicitante(nombreSolicitante);
        solicitud.setID_Producto_Solicitado(idProducto);
        solicitud.setCantidad(cantidadSolicitada);
        solicitud.setEstatus("PENDIENTE");

        // Guardar en la base de datos
        solicitudRepository.save(solicitud);

        return ResponseEntity.ok("Solicitud creada exitosamente con ID: " + solicitud.getId());
    }
}
