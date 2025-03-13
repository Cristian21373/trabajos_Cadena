package com.sena.crud_basic.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name="inventario")
public class inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_inventario")
        private int id_inventario;
    @Column(name="cantidad")
        private String cantidad;
    @Column(name="fecha_actualizacion")
        private LocalDateTime fecha_actualizacion;
    @ManyToOne
    @JoinColumn(name="id_producto")
        private productos id_producto;
    @ManyToOne
    @JoinColumn(name="id_proveedor")
        private proveedores id_Proveedores;
    public inventario(int id_inventario, String cantidad, LocalDateTime fecha_actualizacion, productos id_producto,
            proveedores id_Proveedores) {
        this.id_inventario = id_inventario;
        this.cantidad = cantidad;
        this.fecha_actualizacion = fecha_actualizacion;
        this.id_producto = id_producto;
        this.id_Proveedores = id_Proveedores;
    }
    public int getId_inventario() {
        return id_inventario;
    }
    public void setId_inventario(int id_inventario) {
        this.id_inventario = id_inventario;
    }
    public String getCantidad() {
        return cantidad;
    }
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    public LocalDateTime getFecha_actualizacion() {
        return fecha_actualizacion;
    }
    public void setFecha_actualizacion(LocalDateTime fecha_actualizacion) {
        this.fecha_actualizacion = fecha_actualizacion;
    }
    public productos getId_producto() {
        return id_producto;
    }
    public void setId_producto(productos id_producto) {
        this.id_producto = id_producto;
    }
    public proveedores getId_Proveedores() {
        return id_Proveedores;
    }
    public void setId_Proveedores(proveedores id_Proveedores) {
        this.id_Proveedores = id_Proveedores;
    }
    
}
