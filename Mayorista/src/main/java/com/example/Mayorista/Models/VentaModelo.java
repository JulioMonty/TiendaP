package com.example.Mayorista.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "ventas")
public class VentaModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Integer id;
    private String cliente;
    private String vendedor;
    private String total;

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVendedor() {
        return vendedor;
    }

    public String getCliente() {
        return cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotal() {
        return total;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
