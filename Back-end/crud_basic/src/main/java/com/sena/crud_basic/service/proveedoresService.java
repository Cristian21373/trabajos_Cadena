package com.sena.crud_basic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.crud_basic.DTO.proveedoresDTO;
import com.sena.crud_basic.model.proveedores;
import com.sena.crud_basic.repository.Iproveedores;

@Service
public class proveedoresService {
    @Autowired
    private Iproveedores data;
    public void save(proveedoresDTO proveedoresDTO){
        proveedores proveedoresRegister = converToModel(proveedoresDTO);
        data.save(proveedoresRegister);
    }
    public proveedoresDTO converToDTO(proveedores proveedores){
        proveedoresDTO proveedoresDTO = new proveedoresDTO(
            proveedores.getNombre(),
            proveedores.getContacto(),
            proveedores.getTelefono());
        return proveedoresDTO;
    }
    public proveedores converToModel(proveedoresDTO proveedoresDTO){
        proveedores proveedores = new proveedores(
            0,
            proveedoresDTO.getNombre(),
            proveedoresDTO.getContacto(),
            proveedoresDTO.getTelefono());
        return proveedores;
    }
}