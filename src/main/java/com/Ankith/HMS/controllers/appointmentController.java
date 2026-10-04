package com.Ankith.HMS.controllers;

import com.Ankith.HMS.models.Appointment;
import com.Ankith.HMS.service.appointmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/appointment")
public class appointmentController {

    private static final Logger logger = LoggerFactory.getLogger(appointmentController.class);

    @Autowired
    private appointmentService AppointmentService;

    @GetMapping
    public List<Appointment> getAllAppointment() {
        logger.info("GET /api/v1/appointment - Fetching all appointments");
        return AppointmentService.getAllAppointment();
    }

    @PostMapping
    public Appointment createPatient(@RequestBody Appointment appointmentDetails) {
        logger.info("POST /api/v1/appointment - Creating new appointment");
        return AppointmentService.createAppointment(appointmentDetails);
    }

    @GetMapping("/{id}")
    public Appointment getAppointmentById(@PathVariable Long id) {
        logger.info("GET /api/v1/appointment/{} - Fetching appointment", id);
        return AppointmentService.getAppointmentById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable Long id) {
        logger.info("DELETE /api/v1/appointment/{} - Deleting appointment", id);
        AppointmentService.deleteAppointment(id);
    }

    @PutMapping("/{id}")
    public Appointment updateAppointment(@PathVariable Long id) {
        logger.info("PUT /api/v1/appointment/{} - Updating appointment", id);
        return AppointmentService.updateAppointment(id);
    }
}