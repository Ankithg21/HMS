package com.Ankith.HMS.service;

import com.Ankith.HMS.models.Appointment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class appointmentService {

    private static final Logger logger = LoggerFactory.getLogger(appointmentService.class);

    public List<Appointment> getAllAppointment(){
        try {
            logger.info("Fetching all appointments");
            return null;
        }catch(Exception e){
            logger.error("Error while fetching all appointments");
            return null;
        }
    }

    public Appointment getAppointmentById(Long id){
        try {
            logger.info("Fetching appointment with id: {}", id);
            return null;
        } catch (Exception e) {
            logger.error("Error while fetching appointment with id: {}", id, e);
            return null;
        }
    }

    public Appointment createAppointment(Appointment appointment){
        try {
            logger.info("Creating new appointment");
            return null;
        } catch (Exception e) {
            logger.error("Error while creating appointment", e);
            return null;
        }
    }

    public void deleteAppointment(Long id){
        try {
            logger.info("Deleting appointment with id: {}", id);
            return;
        } catch (Exception e) {
            logger.error("Error while deleting appointment with id: {}", id, e);
            return;
        }
    }

    public Appointment updateAppointment(Long id){
        try {
            logger.info("Updating appointment with id: {}", id);
            return null;
        } catch (Exception e) {
            logger.error("Error while updating appointment with id: {}", id, e);
            return null;
        }
    }
}
