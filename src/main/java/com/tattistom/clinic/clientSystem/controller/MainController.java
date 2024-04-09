package com.tattistom.clinic.clientSystem.controller;

import com.tattistom.clinic.clientSystem.entity.Patient;
import com.tattistom.clinic.clientSystem.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class MainController {

    @Autowired
    PatientService service = new PatientService();
    @GetMapping("/")
    public String greeting(Model model) {
        return "Home";
    }


    @GetMapping("/patients")
    public List<Patient> patientTable(){

        List<Patient> patients = service.getPatientList();
        return patients;
    }

//    public String patientTable(Model model){
//        List<Patient> patients = service.getPatientList();
//
//        model.addAttribute("patients", patients);
//        return "patients";
//    }




    @PostMapping("/patients")
    public Patient newPatient(@RequestBody Patient newPatient){
        return service.addPatient(newPatient);
    }

}