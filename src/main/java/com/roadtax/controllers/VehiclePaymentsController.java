package com.roadtax.controllers;

import com.roadtax.services.TaxService;
import com.roadtax.services.VehiclePaymentsDTOService;
import com.roadtax.views.PaymentOptionsDTO;
import com.roadtax.views.VehiclePaymentsDTO;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@Api(tags = "DTO")
public class VehiclePaymentsController
{
    @Autowired
    private VehiclePaymentsDTOService vehiclePaymentsDTOService;

    @Autowired
    private TaxService taxService;

    @GetMapping("/vehicle/payments")
    public List<VehiclePaymentsDTO> getAllVehiclePayments()
    {
        return vehiclePaymentsDTOService.getAllVehiclePaymentsDTO();
    }

    @GetMapping("/vehicle/{id}/payments")
    public VehiclePaymentsDTO getVehiclePaymentsByID(@PathVariable("id") Integer id)
    {
        VehiclePaymentsDTO vehiclePayments = vehiclePaymentsDTOService.getVehiclePaymentsDTOById(id);

        if(vehiclePayments != null) {
            return vehiclePayments;
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Student ID not found.");
    }

    @PostMapping("/vehicle/{id}/payTax")
    public VehiclePaymentsDTO payTax(@RequestBody PaymentOptionsDTO paymentOptions, @PathVariable("id") Integer id)
    {
        VehiclePaymentsDTO vehiclePayments = vehiclePaymentsDTOService.getVehiclePaymentsDTOById(id);
        if(Boolean.FALSE.equals(vehiclePayments.getTaxed())) {
            taxService.makePayment(paymentOptions, id);
            return vehiclePaymentsDTOService.getVehiclePaymentsDTOById(id);
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Student ID not found.");
    }
}
