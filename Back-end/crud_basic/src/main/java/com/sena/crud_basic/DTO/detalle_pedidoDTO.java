package com.sena.crud_basic.DTO;

import com.sena.crud_basic.model.pedidos;
import com.sena.crud_basic.model.productos;

public class detalle_pedidoDTO {
    private String cantidad;
    private double subtotal;

    public detalle_pedidoDTO(String cantidad, double subtotal){
        this.cantidad=cantidad;
        this.subtotal=subtotal;
    }

    public String getcantidad(){
        return cantidad;
    }
    public void setcantidad(String cantidad){
        this.cantidad=cantidad;
    }

    public double getsubtotal(){
        return subtotal;
    }
    public void setsubtotal(double subtotal){
        this.subtotal=subtotal;
    }

    public pedidos id_pedidos() {
        return id_pedidos();
    }

    public productos id_producto() {
        return id_producto();
    }
}
