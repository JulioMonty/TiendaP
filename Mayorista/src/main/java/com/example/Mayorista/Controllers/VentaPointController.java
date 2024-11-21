package com.example.Mayorista.Controllers;

import com.example.Mayorista.Models.VentaModelo;
import com.example.Mayorista.Services.VentaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/VentaPoint")
public class VentaPointController {
    @Autowired
    VentaServices ventaService;

    @GetMapping("/VentaGuardada")
    public ArrayList<VentaModelo> obtenerVenta(){
        return ventaService.ObtenerVenta();
    }

    @PostMapping()
    public VentaModelo guardarVenta(@RequestBody VentaModelo venta){
        return this.ventaService.GuardarVenta(venta);
    }

    @GetMapping(path = "/{id}")
    public Optional<VentaModelo> obteberPorId(@PathVariable("id")String id){
        return this.ventaService.obteberPorId(id);
    }
}
