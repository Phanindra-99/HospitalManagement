package com.hospitalmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name="patient")
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "patient_name")
    private String patientName;
    @Column(name = "age")
    private int age;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_number")
    private long phoneNumber;
    @Column(name = "gender")
    private String gender;
    @Column(name = "address")
    private String townName;

    public Patient() {
    }

    public Patient(String patientName, int age, String email, long phoneNumber, String gender, String townName) {
        this.patientName = patientName;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.townName = townName;
    }

}