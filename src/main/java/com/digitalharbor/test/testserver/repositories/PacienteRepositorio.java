package com.digitalharbor.test.testserver.repositories;

import java.util.List;

import com.digitalharbor.test.testserver.models.Paciente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PacienteRepositorio extends JpaRepository<Paciente,Integer> {
    List<Paciente> findAll();

    Paciente findById(int id);

    void delete(Paciente p);
}