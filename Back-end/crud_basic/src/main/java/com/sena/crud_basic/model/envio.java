package com.sena.crud_basic.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name="envio")
public class envio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_envio")
        private int id_envio;
    @Column(name="direccion",length = 225,nullable = false)
        private String direccion;
    @Column(name="estado")
        private String estado;
    @Column(name="fecha_envio")
        private Date fecha_envio;
    @ManyToOne
    @JoinColumn(name="id_pedido")
        private pedidos id_pedido;

    public envio(int id_envio, String direccion, String estado, Date fecha_envio, com.sena.crud_basic.model.pedidos id_pedido){
        this.id_envio=id_envio;
        this.direccion=direccion;
        this.estado=estado;
        this.fecha_envio=fecha_envio;
        this.id_pedido=id_pedido;
    }

    public int getId_envio() {
        return id_envio;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEstado() {
        return estado;
    }

    public Date getFecha_envio() {
        return fecha_envio;
    }

    public pedidos getId_pedido() {
        return id_pedido;
    }

    public void setId_envio(int id_envio) {
        this.id_envio = id_envio;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFecha_envio(Date fecha_envio) {
        this.fecha_envio = fecha_envio;
    }

    public void setId_pedido(pedidos id_pedido) {
        this.id_pedido = id_pedido;
    }

    
}
