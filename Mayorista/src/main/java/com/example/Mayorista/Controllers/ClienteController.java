package com.example.Mayorista.Controllers;

import com.example.Mayorista.Models.ClienteModelo;
import com.example.Mayorista.Services.ClienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    ClienteServices clienteServicie;

    @GetMapping()
    public ArrayList<ClienteModelo> obtenerCliente(){
        return clienteServicie.ObtenerCliente();
    }

    @PostMapping()
    public ClienteModelo guardarCliente(@RequestBody ClienteModelo cliente){
        return this.clienteServicie.GuardarCliente(cliente);
    }

    @GetMapping(path = "/{id}")
    public Optional<ClienteModelo> obteberPorId(@PathVariable("id")String id){
        return this.clienteServicie.obteberPorId(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarCliente(@PathVariable("id")String id){
        boolean ok=this.clienteServicie.eliminarCliente(id);
        if(ok){
            return "Se elimino el cliente con Id"+ id;
        }else{
            return "No se elimino el cliente con Id"+ id;
        }
    }
}
