package com.example.Mayorista.Controllers;

import com.example.Mayorista.Models.ProductosModelo;
import com.example.Mayorista.Services.ProductosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/ProductosPoint")
public class ProductosPointController {
    @Autowired
    ProductosServices productosService;

    @GetMapping("/ProductosGuardado")
    public ArrayList<ProductosModelo> obtenerProductos(){
        return productosService.ObtenerProductos();
    }

    @PostMapping()
    public ProductosModelo guardarProductos(@RequestBody ProductosModelo productos){
        return this.productosService.GuardarProductos(productos);
    }

    @GetMapping(path = "/{id}")
    public Optional<ProductosModelo> obteberPorId(@PathVariable("id")String id){
        return this.productosService.obteberPorId(id);
    }
}
