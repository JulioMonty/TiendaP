package com.example.Mayorista.Controllers;


import com.example.Mayorista.Models.UsuarioModelo;
import com.example.Mayorista.Services.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    UsuarioServices usuarioServicie;

    @GetMapping()
    public ArrayList<UsuarioModelo> obtenerUsuarios(){
        return usuarioServicie.ObtenerUsuarios();
    }

    @PostMapping()
    public UsuarioModelo guardarUsuario(@RequestBody UsuarioModelo usuario){
        return this.usuarioServicie.GuardarUsuario(usuario);
    }

    @GetMapping(path = "/{Id_Usuario}")
    public Optional<UsuarioModelo> obteberPorId(@PathVariable("Id_Usuario")String Id_Usuario){
        return this.usuarioServicie.obteberPorId(Id_Usuario);
    }

    @DeleteMapping(path = "/{Id_Usuario}")
    public String eliminarUsuario(@PathVariable("Id_Usuario")String Id_Usuario){
        boolean ok=this.usuarioServicie.eliminarUsuario(Id_Usuario);
        if(ok){
            return "Se elimino el usuario con Id"+ Id_Usuario;
        }else{
            return "No se elimino el usuario con Id"+ Id_Usuario;
        }
    }
}
