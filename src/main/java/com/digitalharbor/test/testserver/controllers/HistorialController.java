package com.digitalharbor.test.testserver.controllers;

import java.util.List;

import com.digitalharbor.test.testserver.models.Historial;
import com.digitalharbor.test.testserver.services.HistorialService;

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
@RequestMapping({ "/historiales" })
public class HistorialController {
    @Autowired
    private HistorialService service;

    @GetMapping
    public List<Historial> listar() {
        return service.listar();
    }

    @PostMapping
    public ResponseEntity<Historial> agregar(@RequestBody Historial p) {
        return ResponseEntity.ok(service.add(p));
    }

    @GetMapping(path = { "/{id}" })
    public Historial listarId(@PathVariable("id") int id) {
        return service.listarId(id);
    }

    @PutMapping(path = { "/{id}" })
    public Historial editar(@RequestBody Historial p, @PathVariable("id") int id) {
        p.setId_historial(id);
        return service.edit(p);
    }

    @DeleteMapping(path = { "/{id}" })
    public Historial delete(@PathVariable("id") int id) {
        return service.delete(id);
    }
    
}