package com.Ankith.HMS.service;

import com.Ankith.HMS.models.Doctor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class doctorService {

    private static final Logger logger = LoggerFactory.getLogger(doctorService.class);

    public List<Doctor> getAllDoctors() {
        try {
            logger.info("Fetching all doctors");
            return null;
        } catch (Exception e) {
            logger.error("Error while fetching all doctors", e);
            return null;
        }
    }

    public Doctor getDoctorById(Long id) {
        try {
            logger.info("Fetching doctor with id: {}", id);
            return null;
        } catch (Exception e) {
            logger.error("Error while fetching doctor with id: {}", id, e);
            return null;
        }
    }

    public Doctor createDoctor(Doctor doctor) {
        try {
            logger.info("Creating new doctor");
            return null;
        } catch (Exception e) {
            logger.error("Error while creating doctor", e);
            return null;
        }
    }

    public void deleteDoctor(Long id) {
        try {
            logger.info("Deleting doctor with id: {}", id);
            return;
        } catch (Exception e) {
            logger.error("Error while deleting doctor with id: {}", id, e);
            return;
        }
    }

    public Doctor updateDoctor(Long id) {
        try {
            logger.info("Updating doctor with id: {}", id);
            return null;
        } catch (Exception e) {
            logger.error("Error while updating doctor with id: {}", id, e);
            return null;
        }
    }
}