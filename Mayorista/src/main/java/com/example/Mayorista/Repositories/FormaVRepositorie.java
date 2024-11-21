package com.example.Mayorista.Repositories;

import com.example.Mayorista.Models.FormaVModelo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormaVRepositorie extends CrudRepository<FormaVModelo,String> {
}
