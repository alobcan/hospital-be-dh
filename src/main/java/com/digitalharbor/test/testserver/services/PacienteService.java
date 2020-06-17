package com.digitalharbor.test.testserver.services;

import java.util.List;

import com.digitalharbor.test.testserver.models.Hospital;
import com.digitalharbor.test.testserver.models.Paciente;
import com.digitalharbor.test.testserver.repositories.HospitalRepositorio;
import com.digitalharbor.test.testserver.repositories.PacienteRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepositorio repositorio;

    @Autowired
    private HospitalRepositorio rep;

    public List<Paciente> listar() {
        return repositorio.findAll();
    }

    public Paciente add(Paciente p) {
        Hospital hospital = rep.findById(p.getId_ref());
        p.setHospital(hospital);
        return repositorio.save(p);
    }

    public Paciente edit(Paciente p, int id) {
        Paciente paciente = repositorio.findById(id);
        p.setHospital(paciente.getHospital());
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