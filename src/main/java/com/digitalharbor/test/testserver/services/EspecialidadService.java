package com.digitalharbor.test.testserver.services;

import java.util.List;

import com.digitalharbor.test.testserver.models.Doctor;
import com.digitalharbor.test.testserver.models.Especialidad;
import com.digitalharbor.test.testserver.repositories.EspecialidadRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EspecialidadService {
    @Autowired
    private EspecialidadRepositorio repositorio;

    public List<Especialidad> listar(){
        return repositorio.findAll();
    }

    public Especialidad addDoctor(Doctor p, int id){
        Especialidad q = repositorio.findById(id);
        p.setEspecialidad(q);
        q.getDoctores().add(p);
        return repositorio.save(q);
    }

    public Especialidad add(Especialidad p) {
        return repositorio.save(p);
    }

    public Especialidad edit(Especialidad p) {
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