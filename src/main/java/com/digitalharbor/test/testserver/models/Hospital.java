package com.digitalharbor.test.testserver.models;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "hospitales")
public class Hospital extends Auditoria {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_hospital;

    @Column
    private String nombre;

    @JsonManagedReference
    @OneToMany(mappedBy = "hospital", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Especialidad> especialidades;

    @JsonManagedReference
    @OneToMany(mappedBy = "hospital", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Paciente> pacientes;

}