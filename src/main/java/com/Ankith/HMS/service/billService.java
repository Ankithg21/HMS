package com.Ankith.HMS.service;

import com.Ankith.HMS.models.Bill;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class billService {
    private static final Logger logger = LoggerFactory.getLogger(billService.class);

    public List<Bill> getAllBill() {
        try {
            logger.info("Fetching all bills");
            return null;
        } catch (Exception e) {
            logger.error("Error while fetching all bills", e);
            return null;
        }
    }

    public Bill getBillById(Long id) {
        try {
            logger.info("Fetching bill with id: {}", id);
            return null;
        } catch (Exception e) {
            logger.error("Error while fetching bill with id: {}", id, e);
            return null;
        }
    }

    public Bill createBill(Bill bill) {
        try {
            logger.info("Creating new bill");
            return null;
        } catch (Exception e) {
            logger.error("Error while creating bill", e);
            return null;
        }
    }

    public void deleteBill(Long id) {
        try {
            logger.info("Deleting bill with id: {}", id);
            return;
        } catch (Exception e) {
            logger.error("Error while deleting bill with id: {}", id, e);
            return;
        }
    }

    public Bill updateBill(Long id) {
        try {
            logger.info("Updating bill with id: {}", id);
            return null;
        } catch (Exception e) {
            logger.error("Error while updating bill with id: {}", id, e);
            return null;
        }
    }
}
