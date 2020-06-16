package com.digitalharbor.test.testserver.services;

import java.util.List;

import com.digitalharbor.test.testserver.models.Historial;
import com.digitalharbor.test.testserver.models.Paciente;
import com.digitalharbor.test.testserver.repositories.PacienteRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepositorio repositorio;

    public List<Paciente> listar() {
        return repositorio.findAll();
    }

    public Paciente addHistorial(Historial p, int id){
        Paciente q = repositorio.findById(id);
        p.setId_paciente(q);
        q.getHistoriales().add(p);
        return repositorio.save(q);
    }

    public Paciente add(Paciente p) {
        return repositorio.save(p);
    }

    public Paciente edit(Paciente p) {
        return repositorio.save(p);
    }

    public Paciente listarId(int id) {
        return repositorio.findById(id);
    }

    public Paciente delete(int id) {
        Paciente p = repositorio.findById(id);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }

    
}