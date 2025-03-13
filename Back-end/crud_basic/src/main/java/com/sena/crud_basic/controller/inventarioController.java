package com.sena.crud_basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.crud_basic.DTO.inventarioDTO;
import com.sena.crud_basic.service.inventarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v4/inventario")
public class inventarioController {
    @Autowired
    private inventarioService inventarioService;
    @PostMapping("/")
    public ResponseEntity<Object> registerInventario(@RequestBody inventarioDTO inventarioDTO){
        inventarioService.save(inventarioDTO);
        return new ResponseEntity<>("Register ok",HttpStatus.OK);
    }
}
