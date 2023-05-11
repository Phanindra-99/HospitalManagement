package com.hospitalmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="doctor")
@Data
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
   @Column(name="doctor_name")
    private String doctorName;
    @Column(name="age")
    private int age;
    @Column(name="specialist")
    private String specialist;
    @Column(name="phone-number")
    private long phoneNumber;
    @Column(name="email")
    private String email;

    public Doctor() {
    }

    public Doctor(String doctorName,int age,String specialist, long phoneNumber, String email) {
        this.doctorName= doctorName;
        this.age = age;
        this.specialist = specialist;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

}
