package com.example.Mayorista.Controllers;

import com.example.Mayorista.Models.FormaVModelo;
import com.example.Mayorista.Services.FormaVServicies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/formaventa")
public class FormaVController {
    @Autowired
    FormaVServicies formaVServicie;

    @GetMapping()
    public ArrayList<FormaVModelo> obtenerFormaV(){
        return formaVServicie.ObtenerFormaV();
    }

    @PostMapping()
    public FormaVModelo guardarFormaV(@RequestBody FormaVModelo formaV){
        return this.formaVServicie.GuardarFormaV(formaV);
    }

    @GetMapping(path = "/{id}")
    public Optional<FormaVModelo> obteberPorId(@PathVariable("id")String id){
        return this.formaVServicie.obteberPorId(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarFormaV(@PathVariable("id")String id){
        boolean ok=this.formaVServicie.eliminarFormaV(id);
        if(ok){
            return "Se elimino la venta con Id"+ id;
        }else{
            return "No se elimino la venta con Id"+ id;
        }
    }
}
