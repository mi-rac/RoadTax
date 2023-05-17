package com.roadtax.views;

import com.roadtax.entities.TaxPayment;

import java.util.List;

public class VehicleTaxPaymentsDTO
{

    private Integer vehicleId;
    private String make;
    private String model;
    private String licensePlate;
    private List<TaxPayment> taxPayments;

    public VehicleTaxPaymentsDTO() {
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public List<TaxPayment> getTaxPayments() {
        return taxPayments;
    }

    public void setTaxPayments(List<TaxPayment> taxPayments) {
        this.taxPayments = taxPayments;
    }
}
