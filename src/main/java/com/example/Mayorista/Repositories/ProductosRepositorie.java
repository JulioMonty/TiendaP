package com.example.Mayorista.Repositories;

import com.example.Mayorista.Models.ProductosModelo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepositorie extends CrudRepository<ProductosModelo,String> {
}
