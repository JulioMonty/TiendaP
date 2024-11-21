package com.example.Mayorista.Controllers;

import com.example.Mayorista.Models.ConfigModelo;
import com.example.Mayorista.Services.ConfigServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/config")
public class ConfigController {
    @Autowired
    ConfigServices configServicie;

    @GetMapping()
    public ArrayList<ConfigModelo> obtenerConfig(){
        return configServicie.ObtenerConfig();
    }

    @PostMapping()
    public ConfigModelo guardarConfig(@RequestBody ConfigModelo config){
        return this.configServicie.GuardarConfig(config);
    }

    @GetMapping(path = "/{id}")
    public Optional<ConfigModelo> obteberPorId(@PathVariable("id")String id){
        return this.configServicie.obteberPorId(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarConfig(@PathVariable("id")String id){
        boolean ok=this.configServicie.eliminarConfig(id);
        if(ok){
            return "Se elimino la config con Id"+ id;
        }else{
            return "No se elimino la config con Id"+ id;
        }
    }
}
