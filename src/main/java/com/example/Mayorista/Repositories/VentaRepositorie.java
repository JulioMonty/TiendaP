package com.example.Mayorista.Repositories;

import com.example.Mayorista.Models.VentaModelo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepositorie extends CrudRepository<VentaModelo,String> {
}
