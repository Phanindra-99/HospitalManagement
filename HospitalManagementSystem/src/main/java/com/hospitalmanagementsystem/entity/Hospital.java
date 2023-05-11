package com.hospitalmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "hospital")
@Data
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "doctor_name")
    private String doctorName;
    @Column(name = "patient_name")
    private String patientName;
    @Column(name = "specialist")
    private String specialist;
    @Column(name = "patient_phone")
    private long patientPhone;
    @Column(name = "appointment_date")
    private String appointmentDate;

    public Hospital() {
    }

    public Hospital(String doctorName,String patientName, String specialist, long patientPhone, String appointmentDate) {
        this.doctorName = doctorName;
        this.patientName = patientName;
        this.specialist = specialist;
        this.patientPhone = patientPhone;
        this.appointmentDate = appointmentDate;
    }
}