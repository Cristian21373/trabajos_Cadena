package com.sena.crud_basic.DTO;

import java.time.LocalDateTime;

import com.sena.crud_basic.model.productos;
import com.sena.crud_basic.model.proveedores;

public class inventarioDTO {
    private String cantidad;
    private LocalDateTime fecha_actualizacion;
    private productos id_producto;
    private proveedores id_proveedor;
    
    public inventarioDTO(String cantidad, LocalDateTime fecha_actualizacion, productos id_producto, proveedores id_proveedor) {
            this.cantidad = cantidad;
            this.fecha_actualizacion = fecha_actualizacion;
            this.id_producto=id_producto;
            this.id_proveedor=id_proveedor;
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

    public productos id_producto() {
        return id_producto;
    }
    public void setid_producto(productos id_producto){
        this.id_producto=id_producto;
    }

    public proveedores id_proveedor() {
        return id_proveedor;
    }
    public void setid_proveedores(proveedores id_proveedor){
        this.id_proveedor=id_proveedor;
    }
}
