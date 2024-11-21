package com.example.Mayorista.Repositories;

import com.example.Mayorista.Models.FabricantesModelo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FabricantesRepositorie extends CrudRepository<FabricantesModelo,String> {
}
