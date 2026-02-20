package com.brandon.gestor_gastos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brandon.gestor_gastos.model.Categoria;
import com.brandon.gestor_gastos.repository.CategoriaRepository;

@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> obtenerCategorias() {
        return categoriaRepository.findAll();
    }

    public Categoria crearCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
}
