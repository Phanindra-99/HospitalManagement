package com.hospitalmanagementsystem.service.serviceImpl;

import com.hospitalmanagementsystem.entity.Doctor;
import com.hospitalmanagementsystem.repo.DoctorRepo;
import com.hospitalmanagementsystem.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    DoctorRepo doctorRepo;
    @Override
    public List<Doctor> getAllList() {
        return doctorRepo.findAll();
    }

    @Override
    public Doctor saveData(Doctor doctor) {
        return doctorRepo.save(doctor);
    }

    @Override
    public Doctor getDataById(Long id) {
        return doctorRepo.findById(id).get();
    }

    @Override
    public Doctor updateData(Doctor doctor) {
        return doctorRepo.save(doctor);
    }

    @Override
    public void deleteDataById(Long id) {
        doctorRepo.deleteById(id);

    }

    @Override
    public List<Doctor> getByKeyword(String keyword) {
        return doctorRepo.findByKeyword(keyword);
    }
}


