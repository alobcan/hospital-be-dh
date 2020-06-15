package com.digitalharbor.test.testserver.repositories;

import java.util.List;

import com.digitalharbor.test.testserver.models.Doctor;

import org.springframework.data.repository.Repository;

public interface DoctorRepositorio extends Repository<Doctor, Integer> {
    List<Doctor> findAll();

    Doctor findById(int id);

    Doctor save(Doctor d);

    void delete(Doctor d);

}