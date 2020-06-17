package com.digitalharbor.test.testserver.controllers;

import java.util.List;

import com.digitalharbor.test.testserver.models.Paciente;
import com.digitalharbor.test.testserver.services.PacienteService;

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
@RequestMapping({ "/pacientes" })
public class PacienteController {
    @Autowired
    private PacienteService service;

    @GetMapping
    public List<Paciente> listar() {
        return service.listar();
    }

    @PostMapping
    public ResponseEntity<Paciente> agregar(@RequestBody Paciente p) {
        return ResponseEntity.ok(service.add(p));
    }

    @GetMapping(path = { "/{id}" })
    public Paciente listarId(@PathVariable("id") int id) {
        return service.listarId(id);
    }

    @PutMapping(path = { "/{id}" })
    public Paciente editar(@RequestBody Paciente p, @PathVariable("id") int id) {
        p.setId_paciente(id);
        return service.edit(p,id);
    }

    @DeleteMapping(path = { "/{id}" })
    public Paciente delete(@PathVariable("id") int id) {
        return service.delete(id);
    }
}