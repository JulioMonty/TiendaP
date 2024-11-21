package com.example.Mayorista.Repositories;

import com.example.Mayorista.Models.SolicitudesModelo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitudRepo extends CrudRepository<SolicitudesModelo,String> {
}
