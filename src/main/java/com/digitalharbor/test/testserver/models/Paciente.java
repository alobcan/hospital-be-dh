package com.digitalharbor.test.testserver.models;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "pacientes")
public class Paciente {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private String fecha_nacimiento;

    @Column
    private String direccion;

}