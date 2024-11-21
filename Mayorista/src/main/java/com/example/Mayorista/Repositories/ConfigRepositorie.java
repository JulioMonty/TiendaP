package com.example.Mayorista.Repositories;
import com.example.Mayorista.Models.ConfigModelo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigRepositorie extends CrudRepository<ConfigModelo,String>{

}
