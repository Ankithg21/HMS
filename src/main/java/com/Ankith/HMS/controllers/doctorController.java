package com.Ankith.HMS.controllers;

import com.Ankith.HMS.models.Doctor;
import com.Ankith.HMS.service.doctorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/doctor")
public class doctorController {

    private static final Logger logger = LoggerFactory.getLogger(doctorController.class);

    @Autowired
    private doctorService DoctorService;

    @GetMapping
    public List<Doctor> getAllDoctors() {
        logger.info("GET /api/v1/doctor - Fetching all doctors");
        return DoctorService.getAllDoctors();
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctorDetails) {
        logger.info("POST /api/v1/doctor - Creating new doctor");

        return DoctorService.createDoctor(doctorDetails);
    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable Long id) {
        logger.info("GET /api/v1/doctor/{} - Fetching doctor", id);
        return DoctorService.getDoctorById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable Long id) {
        logger.info("DELETE /api/v1/doctor/{} - Deleting doctor", id);
        DoctorService.deleteDoctor(id);
    }

    @PutMapping("/{id}")
    public Doctor updateDoctor(@PathVariable Long id) {
        logger.info("PUT /api/v1/doctor/{} - Updating doctor", id);
        return DoctorService.updateDoctor(id);
    }
}