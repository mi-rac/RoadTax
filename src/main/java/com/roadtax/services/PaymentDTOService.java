package com.roadtax.services;

import com.roadtax.entities.Payment;

import com.roadtax.views.PaymentDTO;
import org.springframework.stereotype.Service;


@Service
public class PaymentDTOService
{
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

}
