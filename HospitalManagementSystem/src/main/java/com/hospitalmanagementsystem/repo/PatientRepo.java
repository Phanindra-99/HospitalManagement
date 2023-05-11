package com.hospitalmanagementsystem.repo;

import com.hospitalmanagementsystem.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientRepo extends JpaRepository<Patient,Long> {
    @Query("SELECT p FROM Patient p WHERE p.patientName LIKE %:keyword%")
    List<Patient> findByKeyword(@Param("keyword") String keyword);

}
