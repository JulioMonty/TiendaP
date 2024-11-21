package com.example.Mayorista.Services;

import com.example.Mayorista.Models.VentaModelo;
import com.example.Mayorista.Repositories.VentaRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class VentaServices {
    @Autowired
    VentaRepositorie ventaRepositorie;

    public ArrayList<VentaModelo> ObtenerVenta(){
        return (ArrayList<VentaModelo>) ventaRepositorie.findAll();
    }

    public VentaModelo GuardarVenta(VentaModelo venta){
        return ventaRepositorie.save(venta);
    }
    public Optional<VentaModelo> obteberPorId(String id){
        return ventaRepositorie.findById(id);
    }
    public boolean eliminarVenta(String id) {
        try {
            ventaRepositorie.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
