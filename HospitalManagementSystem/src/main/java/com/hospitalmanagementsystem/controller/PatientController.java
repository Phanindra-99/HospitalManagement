package com.hospitalmanagementsystem.controller;

import com.hospitalmanagementsystem.entity.Patient;
import com.hospitalmanagementsystem.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class PatientController {
    @Autowired
     private PatientService patientService;


    @GetMapping("/patient")
    public String listPatient(Model model) {
        model.addAttribute("patients", patientService.getAllList());
        return "patient";
    }

    @GetMapping("/patient/new")
    public String createPatientForm(Model model) {


        Patient patient= new Patient();
        model.addAttribute("patient", patient);
        return "create_patient";

    }

    @PostMapping("/patient")
    public String savePatient(@ModelAttribute("patient") Patient patient) {
        patientService.saveData(patient);
        return "redirect:/patient";
    }

    @GetMapping("/patient/edit/{id}")
    public String editPatientForm(@PathVariable Long id, Model model) {
        model.addAttribute("patient", patientService.getDataById(id));
        return "edit_patient";
    }

    @PostMapping("/patient/{id}")
    public String updatePatient(@PathVariable Long id,
                                 @ModelAttribute("patient") Patient patient,
                                 Model model) {


        Patient patient1 = patientService.getDataById(id);
        patient1.setId(id);
        patient1.setPatientName(patient.getPatientName());
        patient1.setAge(patient.getAge());
        patient1.setEmail(patient.getEmail());
        patient1.setPhoneNumber(patient.getPhoneNumber());
        patient1.setGender(patient.getGender());
        patient1.setTownName(patient.getTownName());


        patientService.updateData(patient1);
        return "redirect:/patient";
    }



    @GetMapping("/patient/{id}")
    public String deletePatient(@PathVariable Long id) {
        patientService.deleteDataById(id);
        return "redirect:/patient";
    }
}

