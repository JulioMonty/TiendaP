package com.example.Mayorista.Controllers;

import com.example.Mayorista.Models.DetallesModelo;
import com.example.Mayorista.Services.DetallesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/detalles")
public class DetallesController {
    @Autowired
    DetallesServices detallesServicie;

    @GetMapping()
    public ArrayList<DetallesModelo> obtenerDetalles(){
        return detallesServicie.ObtenerDetalles();
    }

    @PostMapping()
    public DetallesModelo guardarDetalles(@RequestBody DetallesModelo detalles){
        return this.detallesServicie.GuardarDetalles(detalles);
    }

    @GetMapping(path = "/{id}")
    public Optional<DetallesModelo> obteberPorId(@PathVariable("id")String id){
        return this.detallesServicie.obteberPorId(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarDetalles(@PathVariable("id")String id){
        boolean ok=this.detallesServicie.eliminarDetalles(id);
        if(ok){
            return "Se elimino el detalle con Id"+ id;
        }else{
            return "No se elimino el detalle con Id"+ id;
        }
    }
}
