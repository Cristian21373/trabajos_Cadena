package com.sena.crud_basic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.crud_basic.DTO.envioDTO;
import com.sena.crud_basic.model.envio;
import com.sena.crud_basic.repository.Ienvio;

@Service
public class envioService {

    @Autowired
    private Ienvio data;
    public void save(envioDTO envioDTO){
        envio envioRegister = converToModel(envioDTO);
        data.save(envioRegister);
    }
    public envioDTO converToDTO(envio envio){
        envioDTO envioDTO = new envioDTO(
            envio.getDireccion(),
            envio.getEstado(),
            envio.getFecha_envio());
        return envioDTO;
    }
    public envio converToModel(envioDTO envioDTO){
        envio envio = new envio(
            0,
            envioDTO.getdireccion(),
            envioDTO.getestado(),
            envioDTO.getfecha_envio(),
            envioDTO.id_pedido()
            );
        return envio;
    }
}
