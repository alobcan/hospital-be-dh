package com.digitalharbor.test.testserver.models;

import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "doctores")
public class Doctor {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_doctor;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date fecha_nacimiento;

    @Column
    private String direccion;

    @Column 
    private int id_ref;

    @JsonBackReference
    @ManyToOne( fetch = FetchType.LAZY)
    @JoinColumn(name = "id_especialidad", insertable = true)
    private Especialidad especialidad;
}