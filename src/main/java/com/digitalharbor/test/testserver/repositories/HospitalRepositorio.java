package com.digitalharbor.test.testserver.repositories;

import java.util.List;

import com.digitalharbor.test.testserver.models.Hospital;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepositorio extends JpaRepository<Hospital,Integer> {
    List<Hospital> findAll();

    Hospital findById(int id);

    void delete(Hospital p);
    
}