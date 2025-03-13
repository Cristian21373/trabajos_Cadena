package com.sena.crud_basic.DTO;

public class proveedoresDTO {
    private String nombre;
    private String contacto;
    private String telefono;

    public proveedoresDTO(String nombre, String contacto, String telefono) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
}