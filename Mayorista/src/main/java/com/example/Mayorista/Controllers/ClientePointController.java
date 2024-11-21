package com.example.Mayorista.Controllers;

import com.example.Mayorista.Models.ClienteModelo;
import com.example.Mayorista.Services.ClienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/ClientePoint")
public class ClientePointController {

    @Autowired
    ClienteServices clienteService;

    @GetMapping("/ClienteGuardado")
    public ArrayList<ClienteModelo> obtenerCliente(){
        return clienteService.ObtenerCliente();
    }

    @PostMapping()
    public ClienteModelo guardarCliente(@RequestBody ClienteModelo cliente){
        return this.clienteService.GuardarCliente(cliente);
    }

    @GetMapping(path = "/{id}")
    public Optional<ClienteModelo> obteberPorId(@PathVariable("id")String id){
        return this.clienteService.obteberPorId(id);
    }
}
