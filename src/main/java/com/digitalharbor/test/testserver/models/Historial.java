package com.digitalharbor.test.testserver.models;

import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "historiales")
public class Historial {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_historial;

    @Column
    private String descripcion;

    @Column
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date fecha;


    @JsonBackReference
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "id_paciente", insertable = true,referencedColumnName = "id_paciente")
    private Paciente id_paciente;

}