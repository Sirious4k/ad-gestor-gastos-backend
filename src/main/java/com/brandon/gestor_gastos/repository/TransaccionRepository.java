package com.brandon.gestor_gastos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.brandon.gestor_gastos.model.Transaccion;

@Repository
public interface TransaccionRepository extends JpaRepository<Transaccion, Long> {
    
}
