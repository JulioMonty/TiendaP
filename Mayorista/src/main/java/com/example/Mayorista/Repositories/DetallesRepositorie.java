package com.example.Mayorista.Repositories;

import com.example.Mayorista.Models.DetallesModelo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetallesRepositorie extends CrudRepository<DetallesModelo,String> {
}
