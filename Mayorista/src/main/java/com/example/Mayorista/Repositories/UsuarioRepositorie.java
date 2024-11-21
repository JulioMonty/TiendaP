package com.example.Mayorista.Repositories;

import com.example.Mayorista.Models.UsuarioModelo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepositorie extends CrudRepository<UsuarioModelo,String> {

}
