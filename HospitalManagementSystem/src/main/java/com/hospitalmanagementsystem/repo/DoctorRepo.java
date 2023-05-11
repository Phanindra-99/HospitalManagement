package com.hospitalmanagementsystem.repo;

import com.hospitalmanagementsystem.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DoctorRepo extends JpaRepository<Doctor,Long> {
    @Query("SELECT d FROM Doctor d WHERE d.doctorName LIKE %:keyword%")
    List<Doctor> findByKeyword(@Param("keyword") String keyword);

}
