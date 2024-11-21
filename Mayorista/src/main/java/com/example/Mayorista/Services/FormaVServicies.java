package com.example.Mayorista.Services;

import com.example.Mayorista.Models.FormaVModelo;
import com.example.Mayorista.Repositories.FormaVRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class FormaVServicies {
    @Autowired
    FormaVRepositorie formaVRepositorie;

    public ArrayList<FormaVModelo> ObtenerFormaV(){
        return (ArrayList<FormaVModelo>) formaVRepositorie.findAll();
    }

    public FormaVModelo GuardarFormaV(FormaVModelo formaV){
        return formaVRepositorie.save(formaV);
    }
    public Optional<FormaVModelo> obteberPorId(String id){
        return formaVRepositorie.findById(id);
    }
    public boolean eliminarFormaV(String id) {
        try {
            formaVRepositorie.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
