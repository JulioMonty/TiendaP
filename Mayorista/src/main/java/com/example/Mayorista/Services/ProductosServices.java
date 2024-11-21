package com.example.Mayorista.Services;

import com.example.Mayorista.Models.ProductosModelo;
import com.example.Mayorista.Repositories.ProductosRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductosServices {
    @Autowired
    ProductosRepositorie productosRepositorie;

    public ArrayList<ProductosModelo> ObtenerProductos(){
        return (ArrayList<ProductosModelo>) productosRepositorie.findAll();
    }

    public ProductosModelo GuardarProductos(ProductosModelo productos){
        return productosRepositorie.save(productos);
    }
    public Optional<ProductosModelo> obteberPorId(String id){
        return productosRepositorie.findById(id);
    }
    public boolean eliminarProductos(String id) {
        try {
            productosRepositorie.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
