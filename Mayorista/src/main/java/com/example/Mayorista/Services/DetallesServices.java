package com.example.Mayorista.Services;

import com.example.Mayorista.Models.DetallesModelo;
import com.example.Mayorista.Repositories.DetallesRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class DetallesServices {
    @Autowired
    DetallesRepositorie detallesRepositorie;

    public ArrayList<DetallesModelo> ObtenerDetalles(){
        return (ArrayList<DetallesModelo>) detallesRepositorie.findAll();
    }

    public DetallesModelo GuardarDetalles(DetallesModelo detalles){
        return detallesRepositorie.save(detalles);
    }
    public Optional<DetallesModelo> obteberPorId(String id){
        return detallesRepositorie.findById(id);
    }
    public boolean eliminarDetalles(String id){
        try {
            detallesRepositorie.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
