package com.digitalharbor.test.testserver.models;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Data
@Entity
@Table(name = "especialidades")
public class Especialidad {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_especialidad;

    @Column
    private String nombre;

    @Column
    private String descripcion;

    @JsonManagedReference
    @OneToMany(mappedBy = "especialidad", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Doctor> doctores;
}