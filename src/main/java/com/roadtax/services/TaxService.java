package com.roadtax.services;

import com.roadtax.controllers.PaymentRepository;
import com.roadtax.controllers.TaxRateRepository;
import com.roadtax.controllers.VehicleRepository;
import com.roadtax.entities.*;
import com.roadtax.views.PaymentOptionsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Calendar;
@Service
public class TaxService
{
    @Autowired
    private VehicleRepository vehicles;

    @Autowired
    private TaxRateRepository rates;

    @Autowired
    private PaymentRepository payments;

    public void makePayment(PaymentOptionsDTO paymentOptions, Integer vehicleId) {
        TaxRate rate = findTaxRate(vehicleId, paymentOptions);
        if (rate != null) {
            Payment payment = newPayment(vehicleId, rate.getRateId(), (Date) paymentOptions.getPaymentDate(), "Paid");
            payments.save(payment);
        }
    }

    public TaxRate findTaxRate(Integer vehicleId, PaymentOptionsDTO paymentOptions) {
        Vehicle vehicle = vehicles.findById(vehicleId).orElse(null);
        if (vehicle != null) {
            Double emissions = vehicle.getEmissions();
            Double listingPrice = vehicle.getListingPrice();
            Date registrationDate = (Date) vehicle.getRegistrationDate();
            Boolean after2017 = (registrationDate.after(Date.valueOf("2017-04-01")));

            Boolean directDebit = paymentOptions.getDirectDebit();
            Boolean firstYear = vehicle.getPayments().isEmpty();
            Boolean richTax = (listingPrice > 40000);
            EmissionBand emissionBand = rates.findByAfter2017AndEmissionsRange(after2017, emissions);
            EngineType engineType = vehicle.getEngineType();
            Integer duration = paymentOptions.getDuration();

            return rates.findTaxRates(directDebit, registrationDate, firstYear, richTax, emissionBand.getId(), engineType.getId(), duration);
        }
        return null;
    }

    public Payment newPayment(Integer vehicleId, Integer taxRateId, Date paymentDate, String paymentStatus) {
        Payment payment = new Payment();
        Vehicle vehicle = vehicles.findById(vehicleId).orElse(null);
        TaxRate rate = rates.findById(taxRateId).orElse(null);

        Calendar calendar = Calendar.getInstance();
        Date validUntil = null;

        if (rate != null) {
            calendar.setTime(paymentDate);
            calendar.add(Calendar.MONTH, rate.getMonthsCovered());
            validUntil = new Date(calendar.getTimeInMillis());
        }

        payment.setVehicle(vehicle);
        payment.setTaxRate(rate);
        payment.setPaymentDate(paymentDate);
        payment.setValidUntil(validUntil);
        payment.setPaymentStatus(paymentStatus);

        return payment;
    }
}
