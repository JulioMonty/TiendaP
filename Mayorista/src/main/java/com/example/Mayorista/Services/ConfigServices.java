package com.example.Mayorista.Services;

import com.example.Mayorista.Models.ConfigModelo;
import com.example.Mayorista.Repositories.ConfigRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ConfigServices {
    @Autowired
    ConfigRepositorie configRepositorie;

    public ArrayList<ConfigModelo> ObtenerConfig(){
        return (ArrayList<ConfigModelo>) configRepositorie.findAll();
    }

    public ConfigModelo GuardarConfig(ConfigModelo config){
        return configRepositorie.save(config);
    }
    public Optional<ConfigModelo> obteberPorId(String id){
        return configRepositorie.findById(id);
    }
    public boolean eliminarConfig(String id){
        try {
            configRepositorie.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
