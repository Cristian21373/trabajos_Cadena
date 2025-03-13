package com.sena.crud_basic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.crud_basic.DTO.inventarioDTO;
import com.sena.crud_basic.model.inventario;
import com.sena.crud_basic.repository.Iinventario;

@Service
public class inventarioService {
    @Autowired
    private Iinventario data;
    public void save(inventarioDTO inventarioDTO){
        inventario inventarioRegister = converToModel(inventarioDTO);
        data.save(inventarioRegister);
    }
    public inventarioDTO converToDTO(inventario inventario){
        inventarioDTO inventarioDTO = new inventarioDTO(
            inventario.getCantidad(),
            inventario.getFecha_actualizacion(),
            inventario.getId_producto(),
            inventario.getId_Proveedores());
        return inventarioDTO;
    }
    public inventario converToModel(inventarioDTO inventarioDTO){
        inventario inventario = new inventario(
            0,
            inventarioDTO.getCantidad(),
            inventarioDTO.getFecha_actualizacion(),
            inventarioDTO.id_producto(),
            inventarioDTO.id_proveedor());
        return inventario;
    }
}
