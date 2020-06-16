package com.digitalharbor.test.testserver.models;

import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "pacientes")
public class Paciente {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_paciente;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date fecha_nacimiento;

    @Column
    private String direccion;

}