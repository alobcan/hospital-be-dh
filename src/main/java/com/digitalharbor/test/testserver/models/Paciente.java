package com.digitalharbor.test.testserver.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "pacientes")
public class Paciente extends Auditoria {

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

    @Column
    private int id_ref;


    @JsonManagedReference
    @OneToMany(mappedBy = "id_paciente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Historial> historiales=new ArrayList<>();

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_hospital", insertable = true)
    private Hospital hospital;

    public void clearHistoriales(){
        this.historiales.clear();
    }

}