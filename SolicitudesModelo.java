package com.example.Mayorista.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "solicitudes")
public class SolicitudesModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (unique = true, nullable = false)

    private Integer id;
    private String Solicitante;
    private Integer ID_Producto_Solicitado;
    private Integer cantidad;
    private String Estatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSolicitante() {
        return Solicitante;
    }

    public void setSolicitante(String solicitante) {
        Solicitante = solicitante;
    }
    public Integer getID_Producto_Solicitado() {
        return ID_Producto_Solicitado;
    }

    public void setID_Producto_Solicitado(Integer ID_Producto_Solicitado) {
        this.ID_Producto_Solicitado = ID_Producto_Solicitado;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstatus() {
        return Estatus;
    }

    public void setEstatus(String estatus) {
        Estatus = estatus;
    }
}
