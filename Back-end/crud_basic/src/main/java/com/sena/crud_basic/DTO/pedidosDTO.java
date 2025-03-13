package com.sena.crud_basic.DTO;

import java.sql.Date;

import com.sena.crud_basic.model.usuarios;

public class pedidosDTO {
    private Date fecha_pedido;
    private double total;
    private String estado;

    public pedidosDTO(Date fecha_pedido, double total, String estado){
        this.fecha_pedido=fecha_pedido;
        this.total=total;
        this.estado=estado;
    }

    public Date getfecha_pedido(){
        return fecha_pedido;
    }
    public void setfecha_pedido(Date fecha_pedido){
        this.fecha_pedido=fecha_pedido;
    }

    public double gettotal(){
        return total;
    }
    public void settotal(double total){
        this.total=total;
    }

    public String geestado(){
        return estado;
    }
    public void setestado(String estado){
        this.estado=estado;
    }

    public usuarios id_usuario() {
        return id_usuario();
    }
}
