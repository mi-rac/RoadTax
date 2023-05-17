package com.roadtax.views;

import com.roadtax.entities.Payment;

import java.util.Date;
import java.util.List;

public class VehiclePaymentsDTO
{
    private Integer vehicleId;
    private String make;
    private String model;
    private String licensePlate;
    private Boolean taxed;
    private Date taxedUntil;

    private List<Payment> payments;

    public VehiclePaymentsDTO()
    {
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public Date getTaxedUntil() {
        return taxedUntil;
    }

    public void setTaxedUntil(Date taxedUntil) {
        this.taxedUntil = taxedUntil;
    }

    public Boolean getTaxed() {
        return taxed;
    }

    public void setTaxed(Boolean taxed) {
        this.taxed = taxed;
    }

    public Integer getVehicleId()
    {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId)
    {
        this.vehicleId = vehicleId;
    }

    public String getMake()
    {
        return make;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getLicensePlate()
    {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate)
    {
        this.licensePlate = licensePlate;
    }
}
