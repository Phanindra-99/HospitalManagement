package com.hospitalmanagementsystem.service;

import com.hospitalmanagementsystem.entity.Patient;


import java.util.List;

public interface PatientService {
    List<Patient> getAllList();
    Patient saveData(Patient patient);

    Patient getDataById(Long id);

    Patient updateData(Patient patient);

    void deleteDataById(Long id);
    public List<Patient> getByKeyword(String keyword);
}

