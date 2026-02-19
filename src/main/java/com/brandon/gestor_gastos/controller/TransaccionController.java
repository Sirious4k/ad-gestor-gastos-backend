package com.brandon.gestor_gastos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brandon.gestor_gastos.model.Transaccion;
import com.brandon.gestor_gastos.service.TransaccionService;

@RestController
@RequestMapping("/api/transacciones")
public class TransaccionController {
    
    @Autowired
    private TransaccionService transaccionService;

    @GetMapping
    public List<Transaccion> obtenerTodas() {
        return transaccionService.obtenerTodas();
    }

    @PostMapping
    public Transaccion crear(@RequestBody Transaccion transaccion) {
        return transaccionService.guardar(transaccion);
    }
}
