package com.Ankith.HMS.service;

import com.Ankith.HMS.models.Patient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class patientService {

    private static final Logger logger = LoggerFactory.getLogger(patientService.class);

    public List<Patient> getAllPatients() {
        try {
            logger.info("Fetching all patients");
            return null;
        } catch (Exception e) {
            logger.error("Error while fetching all patients", e);
            return null;
        }
    }

    public Patient getPatientById(Long id) {
        try {
            logger.info("Fetching patient with id: {}", id);
            return null;
        } catch (Exception e) {
            logger.error("Error while fetching patient with id: {}", id, e);
            return null;
        }
    }

    public Patient createPatient(Patient patient) {
        try {
            logger.info("Creating new patient");
            return null;
        } catch (Exception e) {
            logger.error("Error while creating patient", e);
            return null;
        }
    }

    public void deletePatient(Long id) {
        try {
            logger.info("Deleting patient with id: {}", id);
            return;
        } catch (Exception e) {
            logger.error("Error while deleting patient with id: {}", id, e);
            return;
        }
    }

    public Patient updatePatient(Long id) {
        try {
            logger.info("Updating patient with id: {}", id);
            return null;
        } catch (Exception e) {
            logger.error("Error while updating patient with id: {}", id, e);
            return null;
        }
    }
}