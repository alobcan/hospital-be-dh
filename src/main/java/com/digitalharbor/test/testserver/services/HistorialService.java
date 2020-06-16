package com.digitalharbor.test.testserver.services;

import java.util.List;

import com.digitalharbor.test.testserver.models.Historial;
import com.digitalharbor.test.testserver.repositories.HistorialRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistorialService {
    @Autowired
    private HistorialRepositorio repositorio;

    public List<Historial> listar() {
        return repositorio.findAll();
    }

    public Historial listarId(int id) {
        return repositorio.findById(id);
    }

    public Historial add(Historial p) {
        return repositorio.save(p);
    }

    public Historial edit(Historial p) {
        return repositorio.save(p);
    }

    public Historial delete(int id) {
        Historial p = repositorio.findById(id);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
    
}