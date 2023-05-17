package com.roadtax.services;

import com.roadtax.controllers.TaxRateRepository;
import com.roadtax.controllers.VehicleRepository;
import com.roadtax.entities.Owner;
import com.roadtax.entities.Payment;
import com.roadtax.entities.TaxRate;
import com.roadtax.entities.Vehicle;
import com.roadtax.views.OwnerVehicleListDTO;
import com.roadtax.views.PaymentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Calendar;


@Service
public class PaymentDTOService
{
    @Autowired
    private VehicleRepository vehicles;

    @Autowired
    private TaxRateRepository rates;

    public PaymentDTO convertToPaymentDTO(Payment payment)
    {
        PaymentDTO paymentDTO = new PaymentDTO();
        paymentDTO.setPaymentId(payment.getPaymentId());
        paymentDTO.setTaxRate(payment.getTaxRate().getTaxRate());
        paymentDTO.setPaymentDate(payment.getPaymentDate());
        paymentDTO.setValidUntil(payment.getValidUntil());
        paymentDTO.setPaymentStatus(payment.getPaymentStatus());
        return paymentDTO;
    }


    public Payment newPayment(Integer vehicleId, Integer taxRateId, String paymentDate, String paymentStatus) {
        Payment payment = new Payment();
        Vehicle vehicle = vehicles.findById(vehicleId).orElse(null);
        TaxRate rate = rates.findById(taxRateId).orElse(null);
        Date payDate = Date.valueOf(paymentDate);
        Calendar calendar = Calendar.getInstance();
        Date validUntil = null;

        if (rate != null) {
            calendar.setTime(payDate);
            calendar.add(Calendar.MONTH, rate.getMonthsCovered());
            validUntil = new Date(calendar.getTimeInMillis());
        }

        payment.setVehicle(vehicle);
        payment.setTaxRate(rate);
        payment.setPaymentDate(payDate);
        payment.setValidUntil(validUntil);
        payment.setPaymentStatus(paymentStatus);

        return payment;
    }

}
