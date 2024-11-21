package com.example.Mayorista.Controllers;

import com.example.Mayorista.Models.FabricantesModelo;
import com.example.Mayorista.Services.FabricantesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/fabricantes")
public class FabricantesController {
    @Autowired
    FabricantesServices fabricantesServicie;

    @GetMapping()
    public ArrayList<FabricantesModelo> obtenerFabricantes(){
        return fabricantesServicie.ObtenerFabricantes();
    }

    @PostMapping()
    public FabricantesModelo guardarFabricantes(@RequestBody FabricantesModelo fabricantes){
        return this.fabricantesServicie.GuardarFabricantes(fabricantes);
    }

    @GetMapping(path = "/{id}")
    public Optional<FabricantesModelo> obteberPorId(@PathVariable("id")String id){
        return this.fabricantesServicie.obteberPorId(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarFabricantes(@PathVariable("id")String id){
        boolean ok=this.fabricantesServicie.eliminarFabricantes(id);
        if(ok){
            return "Se elimino el fabricante con Id"+ id;
        }else{
            return "No se elimino el fabricante con Id"+ id;
        }
    }
}
