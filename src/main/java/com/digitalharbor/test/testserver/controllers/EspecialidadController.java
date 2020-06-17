package com.digitalharbor.test.testserver.controllers;

import java.util.List;

import com.digitalharbor.test.testserver.models.Especialidad;
import com.digitalharbor.test.testserver.services.EspecialidadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({ "/especialidades" })
public class EspecialidadController {
    @Autowired
    private EspecialidadService service;

    @GetMapping
    public List<Especialidad> listar() {
        return service.listar();
    }

    @PostMapping
    public ResponseEntity<Especialidad> agregar(@RequestBody Especialidad p) {
        return ResponseEntity.ok(service.add(p));
    }

    @GetMapping(path = { "/{id}" })
    public Especialidad listarId(@PathVariable("id") int id) {
        return service.listarId(id);
    }

    @PutMapping(path = { "/{id}" })
    public Especialidad editar(@RequestBody Especialidad p, @PathVariable("id") int id) {
        p.setId_especialidad(id);
        return service.edit(p, id);
    }

    @DeleteMapping(path = { "/{id}" })
    public Especialidad delete(@PathVariable("id") int id) {
        return service.delete(id);
    }
}