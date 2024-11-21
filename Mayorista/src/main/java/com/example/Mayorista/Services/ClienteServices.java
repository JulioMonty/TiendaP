package com.example.Mayorista.Services;

import com.example.Mayorista.Models.ClienteModelo;
import com.example.Mayorista.Repositories.ClienteRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ClienteServices {
    @Autowired
    ClienteRepositorie clienteRepositorie;

    public ArrayList<ClienteModelo> ObtenerCliente(){
        return (ArrayList<ClienteModelo>) clienteRepositorie.findAll();
    }

    public ClienteModelo GuardarCliente(ClienteModelo cliente){
        return clienteRepositorie.save(cliente);
    }
    public Optional<ClienteModelo> obteberPorId(String id){
        return clienteRepositorie.findById(id);
    }
    public boolean eliminarCliente(String id){
        try {
            clienteRepositorie.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
