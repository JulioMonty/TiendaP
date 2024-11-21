package com.example.Mayorista.Controllers;

import com.example.Mayorista.Models.VentaModelo;
import com.example.Mayorista.Services.VentaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/venta")
public class VentaController {
    @Autowired
    VentaServices ventaService;

    @GetMapping()
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

    @DeleteMapping(path = "/{id}")
    public String eliminarVenta(@PathVariable("id")String id){
        boolean ok=this.ventaService.eliminarVenta(id);
        if(ok){
            return "Se elimino la venta con Id"+ id;
        }else{
            return "No se elimino la venta con Id"+ id;
        }
    }
}
