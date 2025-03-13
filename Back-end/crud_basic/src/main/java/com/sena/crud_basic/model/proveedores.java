package com.sena.crud_basic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="proveedores")
public class proveedores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_proveedor")
        private int id_proveedor;
    @Column(name="nombre",length = 100,nullable = false)
        private String nombre;
    @Column(name="contacto")
        private String contacto;
    @Column(name="telefono")
        private String telefono;
    public proveedores(int id_proveedor, String nombre, String contacto, String telefono) {
        this.id_proveedor = id_proveedor;
        this.nombre = nombre;
        this.contacto = contacto;
        this.telefono = telefono;
    }
    public int getId_proveedor() {
        return id_proveedor;
    }
    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getContacto() {
        return contacto;
    }
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
