package com.digitalharbor.test.testserver.repositories;

import java.util.List;

import com.digitalharbor.test.testserver.models.Paciente;

import org.springframework.data.repository.Repository;

public interface PacienteRepositorio extends Repository<Paciente, Integer> {
    List<Paciente> findAll();

    Paciente findById(int id);

    Paciente save(Paciente p);

    void delete(Paciente p);
}