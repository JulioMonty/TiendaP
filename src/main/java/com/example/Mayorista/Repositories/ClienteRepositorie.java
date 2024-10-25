package com.example.Mayorista.Repositories;

import com.example.Mayorista.Models.ClienteModelo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositorie extends CrudRepository<ClienteModelo,String> {

}
