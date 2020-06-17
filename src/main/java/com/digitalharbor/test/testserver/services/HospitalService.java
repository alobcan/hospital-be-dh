package com.digitalharbor.test.testserver.services;

import java.util.List;

import com.digitalharbor.test.testserver.models.Especialidad;
import com.digitalharbor.test.testserver.models.Hospital;
import com.digitalharbor.test.testserver.models.Paciente;
import com.digitalharbor.test.testserver.repositories.HospitalRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalService {
    @Autowired
    private HospitalRepositorio repositorio;

    public List<Hospital> listar() {
        return repositorio.findAll();
    }

    public Hospital addPaciente(Paciente p, int id){
        Hospital hospital = repositorio.findById(id);
        p.setHospital(hospital);
        hospital.getPacientes().add(p);
        return repositorio.save(hospital);
    }

    public Hospital addEspecialidad(Especialidad p, int id){
        Hospital hospital= repositorio.findById(id);
        p.setHospital(hospital);
        hospital.getEspecialidades().add(p);
        return repositorio.save(hospital);
    }

    public Hospital add(Hospital p){
        return repositorio.save(p);
    }

    public Hospital edit(Hospital p){
        return repositorio.save(p);
    }

    public Hospital listarId(int id){
        return repositorio.findById(id);
    }

    public Hospital delete(int id){
        Hospital p = repositorio.findById(id);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}