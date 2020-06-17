package com.digitalharbor.test.testserver.controllers;

import java.util.List;

import com.digitalharbor.test.testserver.models.Hospital;
import com.digitalharbor.test.testserver.models.Paciente;
import com.digitalharbor.test.testserver.services.HospitalService;

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
@RequestMapping({ "/hospitales" })
public class HospitalController {
    @Autowired
    private HospitalService service;

    @GetMapping
    public List<Hospital> listar() {
        return service.listar();
    }

    @PostMapping
    public ResponseEntity<Hospital> agregar(@RequestBody Hospital p) {
        return ResponseEntity.ok(service.add(p));
    }

    @PostMapping(path = { "/{id}" })
    public Hospital agregarPaciente(@RequestBody Paciente p, @PathVariable("id") int id) {
        return service.addPaciente(p, id);
    }

    @GetMapping(path = { "/{id}" })
    public Hospital listarId(@PathVariable("id") int id) {
        return service.listarId(id);
    }

    @PutMapping(path = { "/{id}" })
    public Hospital editar(@RequestBody Hospital p, @PathVariable("id") int id) {
        p.setId_hospital(id);
        return service.edit(p);
    }

    @DeleteMapping(path = { "/{id}" })
    public Hospital delete(@PathVariable("id") int id) {
        return service.delete(id);
    }
}