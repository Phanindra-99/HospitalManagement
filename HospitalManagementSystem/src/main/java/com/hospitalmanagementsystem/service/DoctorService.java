package com.hospitalmanagementsystem.service;

import com.hospitalmanagementsystem.entity.Doctor;

import java.util.List;

public interface DoctorService {
    List<Doctor> getAllList();
    Doctor saveData(Doctor doctor);

    Doctor getDataById(Long id);

    Doctor updateData(Doctor doctor);

    void deleteDataById(Long id);
    public List<Doctor> getByKeyword(String keyword);
}


