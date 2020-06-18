package com.digitalharbor.test.testserver.models;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "especialidades")
public class Especialidad extends Auditoria {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_especialidad;

    @Column
    private String nombre;

    @Column
    private String descripcion;
    
    @Column
    private int id_ref;

    @JsonManagedReference
    @OneToMany(mappedBy = "especialidad", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Doctor> doctores;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_hospital", insertable = true)
    private Hospital hospital;

}