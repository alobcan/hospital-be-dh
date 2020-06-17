package com.digitalharbor.test.testserver.repositories;

import java.util.List;

import com.digitalharbor.test.testserver.models.Especialidad;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EspecialidadRepositorio extends JpaRepository<Especialidad,Integer>{
    List<Especialidad> findAll();

    Especialidad findById(int id);

    void delete(Especialidad p);
}