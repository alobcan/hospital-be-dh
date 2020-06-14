package com.digitalharbor.test.testserver.services;

import java.util.List;

import com.digitalharbor.test.testserver.models.Paciente;

public interface PacienteService {
    List<Paciente> listar();

    Paciente listarId(int id);

    Paciente add(Paciente p);

    Paciente edit(Paciente p);

    Paciente delete(int id);

}