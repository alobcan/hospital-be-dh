package com.digitalharbor.test.testserver.services;

import java.util.List;

import com.digitalharbor.test.testserver.models.Especialidad;
import com.digitalharbor.test.testserver.models.Hospital;
import com.digitalharbor.test.testserver.repositories.EspecialidadRepositorio;
import com.digitalharbor.test.testserver.repositories.HospitalRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EspecialidadService {
    @Autowired
    private EspecialidadRepositorio repositorio;
    @Autowired
    private HospitalRepositorio rep;

    public List<Especialidad> listar(){
        return repositorio.findAll();
    }

    public Especialidad add(Especialidad p) {
        Hospital hospital = rep.findById(p.getId_ref());
        p.setHospital(hospital);
        return repositorio.save(p);
    }

    public Especialidad edit(Especialidad p, int id) {
        Especialidad especialidad = repositorio.findById(id);
        p.setHospital(especialidad.getHospital());
        return repositorio.save(p);
    }

    public Especialidad listarId(int id) {
        return repositorio.findById(id);
    }

    public Especialidad delete(int id) {
        Especialidad p = repositorio.findById(id);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
    
}