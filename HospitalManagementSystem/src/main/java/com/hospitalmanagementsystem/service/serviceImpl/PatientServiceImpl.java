package com.hospitalmanagementsystem.service.serviceImpl;

import com.hospitalmanagementsystem.entity.Patient;
import com.hospitalmanagementsystem.repo.PatientRepo;
import com.hospitalmanagementsystem.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    PatientRepo patientRepo;
    @Override
    public List<Patient> getAllList() {
        return patientRepo.findAll();
    }

    @Override
    public Patient saveData(Patient patient) {
        return patientRepo.save(patient);
    }

    @Override
    public Patient getDataById(Long id) {
        return patientRepo.findById(id).get();
    }

    @Override
    public Patient updateData(Patient patient) {
        return patientRepo.save(patient);
    }

    @Override
    public void deleteDataById(Long id) {
        patientRepo.deleteById(id);

    }

    @Override
    public List<Patient> getByKeyword(String keyword) {
        return patientRepo.findByKeyword(keyword);
    }
}


