package com.digitalharbor.test.testserver.services;

import java.util.List;

import com.digitalharbor.test.testserver.models.Doctor;
import com.digitalharbor.test.testserver.models.Especialidad;
import com.digitalharbor.test.testserver.repositories.DoctorRepositorio;
import com.digitalharbor.test.testserver.repositories.EspecialidadRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepositorio repositorio;
    @Autowired
    private EspecialidadRepositorio rep;


    public List<Doctor> listar() {
        return repositorio.findAll();
    }

    public Doctor listarId(int id) {
        return repositorio.findById(id);
    }

    public Doctor add(Doctor p) {
        Especialidad especialidad = rep.findById(p.getId_ref());
        p.setEspecialidad(especialidad);
        return repositorio.save(p);
    }

    public Doctor edit(Doctor p, int id) {
        Doctor doctor = repositorio.findById(id);
        p.setEspecialidad(doctor.getEspecialidad());
        return repositorio.save(p);
    }

    public Doctor delete(int id) {
        Doctor p = repositorio.findById(id);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
    
}