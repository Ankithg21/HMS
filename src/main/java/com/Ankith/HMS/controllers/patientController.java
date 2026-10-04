package com.Ankith.HMS.controllers;

import com.Ankith.HMS.service.patientService;
import com.Ankith.HMS.models.Patient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/patient")
public class patientController {

    private static final Logger logger = LoggerFactory.getLogger(patientController.class);

    @Autowired
    private patientService PatientService;

    @GetMapping
    public List<Patient> getAllPatients() {
        logger.info("GET /api/v1/patient - Fetching all patients");
        return PatientService.getAllPatients();
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patientDetails) {
        logger.info("POST /api/v1/patient - Creating new patient");
        return PatientService.createPatient(patientDetails);
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id) {
        logger.info("GET /api/v1/patient/{} - Fetching patient", id);
        return PatientService.getPatientById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id) {
        logger.info("DELETE /api/v1/patient/{} - Deleting patient", id);
        PatientService.deletePatient(id);
    }

    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable Long id) {
        logger.info("PUT /api/v1/patient/{} - Updating patient", id);
        return PatientService.updatePatient(id);
    }
}