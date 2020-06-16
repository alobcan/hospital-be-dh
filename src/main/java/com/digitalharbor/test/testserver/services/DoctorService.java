package com.digitalharbor.test.testserver.services;

import java.util.List;

import com.digitalharbor.test.testserver.models.Doctor;
import com.digitalharbor.test.testserver.repositories.DoctorRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepositorio repositorio;

    public List<Doctor> listar() {
        return repositorio.findAll();
    }

    public Doctor listarId(int id) {
        return repositorio.findById(id);
    }

    public Doctor add(Doctor p) {
        return repositorio.save(p);
    }

    public Doctor edit(Doctor p) {
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