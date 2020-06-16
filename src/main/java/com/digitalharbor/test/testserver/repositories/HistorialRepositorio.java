package com.digitalharbor.test.testserver.repositories;

import java.util.List;

import com.digitalharbor.test.testserver.models.Historial;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialRepositorio extends JpaRepository<Historial, Integer> {
    List<Historial> findAll();

    Historial findById(int id);

    void delete(Historial p);
}