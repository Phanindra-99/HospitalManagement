package com.hospitalmanagementsystem.controller;

import com.hospitalmanagementsystem.entity.Doctor;
import com.hospitalmanagementsystem.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping("/doctor")
    public String listDoctor(Model model) {
        model.addAttribute("doctors", doctorService.getAllList());
        return "doctor";
    }

    @GetMapping("/doctor/new")
    public String createDoctorForm(Model model) {

        Doctor doctor = new Doctor();
        model.addAttribute("doctor", doctor);
        return "create_doctor";

    }

    @PostMapping("/doctor")
    public String saveDoctor(@ModelAttribute("doctor") Doctor doctor) {
        doctorService.saveData(doctor);
        return "redirect:/doctor";
    }

    @GetMapping("/doctor/edit/{id}")
    public String editDoctorForm(@PathVariable Long id, Model model) {
        model.addAttribute("patient", doctorService.getDataById(id));
        return "edit_doctor";
    }

    @PostMapping("/doctor/{id}")
    public String updateDoctor(@PathVariable Long id,
                                 @ModelAttribute("doctor") Doctor doctor,
                                 Model model) {


        Doctor doctor1 = doctorService.getDataById(id);
        doctor1.setId(id);
        doctor1.setDoctorName(doctor.getDoctorName());
        doctor1.setAge(doctor.getAge());
        doctor1.setSpecialist (doctor.getSpecialist());
        doctor1.setPhoneNumber(doctor.getPhoneNumber());
        doctor1.setEmail(doctor.getEmail());


        doctorService.updateData(doctor1);
        return "redirect:/doctor";
    }



    @GetMapping("/doctor/{id}")
    public String deleteDoctor(@PathVariable Long id) {
        doctorService.deleteDataById(id);
        return "redirect:/doctor";
    }
}

