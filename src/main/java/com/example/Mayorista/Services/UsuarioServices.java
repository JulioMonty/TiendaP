package com.example.Mayorista.Services;

import com.example.Mayorista.Models.UsuarioModelo;
import com.example.Mayorista.Repositories.UsuarioRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioServices {
    @Autowired
    UsuarioRepositorie usuarioRepositorie;

    public ArrayList<UsuarioModelo> ObtenerUsuarios(){
        return (ArrayList<UsuarioModelo>) usuarioRepositorie.findAll();
    }

    public UsuarioModelo GuardarUsuario(UsuarioModelo usuario){
        return usuarioRepositorie.save(usuario);
    }
    public Optional<UsuarioModelo> obteberPorId(String Id_Usuario){
        return usuarioRepositorie.findById(Id_Usuario);
    }
    public boolean eliminarUsuario(String Id_Usuario){
        try {
            usuarioRepositorie.deleteById(Id_Usuario);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
