package com.digitalharbor.test.testserver.repositories;

import java.util.List;

import com.digitalharbor.test.testserver.models.Doctor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepositorio extends JpaRepository<Doctor,Integer> {
    List<Doctor> findAll();

    Doctor findById(int id);

    void delete(Doctor d);

}