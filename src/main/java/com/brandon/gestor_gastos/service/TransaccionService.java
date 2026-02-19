package com.brandon.gestor_gastos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brandon.gestor_gastos.model.Transaccion;
import com.brandon.gestor_gastos.repository.TransaccionRepository;

@Service
public class TransaccionService {
    
    @Autowired
    private TransaccionRepository transaccionRepository;

    public List<Transaccion> obtenerTodas() {
        return transaccionRepository.findAll();
    }

    public Transaccion guardar(Transaccion transaccion) {
        return transaccionRepository.save(transaccion);
    }
}
