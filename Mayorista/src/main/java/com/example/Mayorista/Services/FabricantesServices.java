package com.example.Mayorista.Services;

import com.example.Mayorista.Models.FabricantesModelo;
import com.example.Mayorista.Repositories.FabricantesRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class FabricantesServices {
    @Autowired
    FabricantesRepositorie fabricantesRepositorie;

    public ArrayList<FabricantesModelo> ObtenerFabricantes(){
        return (ArrayList<FabricantesModelo>) fabricantesRepositorie.findAll();
    }

    public FabricantesModelo GuardarFabricantes(FabricantesModelo fabricantes){
        return fabricantesRepositorie.save(fabricantes);
    }
    public Optional<FabricantesModelo> obteberPorId(String id){
        return fabricantesRepositorie.findById(id);
    }
    public boolean eliminarFabricantes(String id) {
        try {
            fabricantesRepositorie.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
