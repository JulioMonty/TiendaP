package com.example.Mayorista.Models;

import jakarta.persistence.*;

@Entity
@Table (name="usuarios")
public class UsuarioModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (unique = true,nullable = false)

    private String Id_Usuario;
    private String Nombre_Usuario;
    private String Contra;

    public void setId_Usuario(String id_Usuario) {
        Id_Usuario = id_Usuario;
    }

    public String getId_Usuario() {
        return Id_Usuario;
    }

    public void setNombre_Usuario(String nombre_Usuario) {
        Nombre_Usuario = nombre_Usuario;
    }

    public String getNombre_Usuario() {
        return Nombre_Usuario;
    }

    public void setContra(String contra) {
        Contra = contra;
    }

    public String getContra() {
        return Contra;
    }
}
