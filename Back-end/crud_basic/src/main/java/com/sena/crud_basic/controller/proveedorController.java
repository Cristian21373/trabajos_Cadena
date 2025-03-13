package com.sena.crud_basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.crud_basic.DTO.proveedoresDTO;
import com.sena.crud_basic.service.proveedoresService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v4/proveedor")
public class proveedorController {
    @Autowired
    private proveedoresService proveedoresService;
    @PostMapping("/")
    public ResponseEntity<Object> registerProveedores(@RequestBody proveedoresDTO proveedoresDTO){
        proveedoresService.save(proveedoresDTO);
        return new ResponseEntity<>("Regisrter ok",HttpStatus.OK);
    }
}
