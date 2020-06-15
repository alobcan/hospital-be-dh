package com.digitalharbor.test.testserver.services;

import java.util.List;

import com.digitalharbor.test.testserver.models.Doctor;

public interface DoctorService {
    List<Doctor> listar();

    Doctor listarId(int id);

    Doctor add(Doctor p);

    Doctor edit(Doctor p);

    Doctor delete(int id);

}