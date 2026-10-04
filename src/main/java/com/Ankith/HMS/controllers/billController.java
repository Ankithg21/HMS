package com.Ankith.HMS.controllers;

import com.Ankith.HMS.models.Bill;
import com.Ankith.HMS.service.billService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/bill")
public class billController {

    private static final Logger logger = LoggerFactory.getLogger(billController.class);

    @Autowired
    private billService BillService;

    @GetMapping
    public List<Bill> getAllBills() {
        logger.info("GET /api/v1/bill - Fetching all bills");
        return BillService.getAllBill();
    }

    @PostMapping
    public Bill createPatient(@RequestBody Bill billDetails) {
        logger.info("POST /api/v1/bill - Creating new bill");
        return BillService.createBill(billDetails);
    }

    @GetMapping("/{id}")
    public Bill getBillById(@PathVariable Long id) {
        logger.info("GET /api/v1/bill/{} - Fetching bill", id);
        return BillService.getBillById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBill(@PathVariable Long id) {
        logger.info("DELETE /api/v1/bill/{} - Deleting bill", id);
        BillService.deleteBill(id);
    }

    @PutMapping("/{id}")
    public Bill updateBill(@PathVariable Long id) {
        logger.info("PUT /api/v1/bill/{} - Updating bill", id);
        return BillService.updateBill(id);
    }
}