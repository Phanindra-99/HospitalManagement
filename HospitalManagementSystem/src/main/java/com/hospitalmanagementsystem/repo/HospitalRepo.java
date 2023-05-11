package com.hospitalmanagementsystem.repo;

import com.hospitalmanagementsystem.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HospitalRepo extends JpaRepository<Hospital,Long> {
    @Query("SELECT h FROM Hospital h WHERE h.doctorName LIKE %:keyword% OR h.patientName LIKE %:keyword%")
    List<Hospital> findByKeyword(@Param("keyword") String keyword);
}
