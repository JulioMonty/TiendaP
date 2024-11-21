package com.example.Mayorista.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class ProductosModelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (unique = true, nullable = false)

    private Integer Id;
    private String codigo;
    private String nombre;
    private String fabricante;
    private Integer stock;
    private Double Precio_Unitario;
    private Double Precio_Menudeo;
    private Double Precio_Mayoreo;
    private Double Precio_Publico;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getStock() {
        return stock;
    }

    public Double getPrecio_Mayoreo() {
        return Precio_Mayoreo;
    }

    public String getCodigo() {
        return codigo;
    }

    public Double getPrecio_Menudeo() {
        return Precio_Menudeo;
    }

    public Double getPrecio_Unitario() {
        return Precio_Unitario;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getPrecio_Publico() {
        return Precio_Publico;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setPrecio_Mayoreo(Double precio_Mayoreo) {
        Precio_Mayoreo = precio_Mayoreo;
    }

    public void setPrecio_Menudeo(Double precio_Menudeo) {
        Precio_Menudeo = precio_Menudeo;
    }

    public void setPrecio_Publico(Double precio_Publico) {
        Precio_Publico = precio_Publico;
    }

    public void setPrecio_Unitario(Double precio_Unitario) {
        Precio_Unitario = precio_Unitario;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
