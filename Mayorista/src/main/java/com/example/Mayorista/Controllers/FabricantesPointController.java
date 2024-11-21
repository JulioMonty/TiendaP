package com.example.Mayorista.Controllers;

import com.example.Mayorista.Models.FabricantesModelo;
import com.example.Mayorista.Services.FabricantesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/FabricantesPoint")
public class FabricantesPointController {
    @Autowired
    FabricantesServices fabricantesService;

    @GetMapping("/FabricantesGuardado")
    public ArrayList<FabricantesModelo> obtenerFabricantes(){
        return fabricantesService.ObtenerFabricantes();
    }

    @PostMapping()
    public FabricantesModelo guardarFabricantes(@RequestBody FabricantesModelo fabricantes){
        return this.fabricantesService.GuardarFabricantes(fabricantes);
    }

    @GetMapping(path = "/{id}")
    public Optional<FabricantesModelo> obteberPorId(@PathVariable("id")String id){
        return this.fabricantesService.obteberPorId(id);
    }
}
