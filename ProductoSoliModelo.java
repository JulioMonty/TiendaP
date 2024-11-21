package com.example.Mayorista.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "prodcutossolicitud")
public class ProductoSoliModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (unique = true, nullable = false)

    private Integer id;
    private Integer id_Solicitud;
    private Integer id_Producto;
    private Double Cantidad_Pago;
    private Double Precio_Publico;
    private Double Total_Final;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_Solicitud() {
        return id_Solicitud;
    }

    public void setId_Solicitud(Integer id_Solicitud) {
        this.id_Solicitud = id_Solicitud;
    }

    public Integer getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(Integer id_Producto) {
        this.id_Producto = id_Producto;
    }

    public Double getCantidad_Pago() {
        return Cantidad_Pago;
    }

    public void setCantidad_Pago(Double cantidad_Pago) {
        Cantidad_Pago = cantidad_Pago;
    }

    public Double getPrecio_Publico() {
        return Precio_Publico;
    }

    public void setPrecio_Publico(Double precio_Publico) {
        Precio_Publico = precio_Publico;
    }

    public Double getTotal_Final() {
        return Total_Final;
    }

    public void setTotal_Final(Double total_Final) {
        Total_Final = total_Final;
    }
}

