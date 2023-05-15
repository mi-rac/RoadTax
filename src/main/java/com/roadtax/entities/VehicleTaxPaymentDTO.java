package com.roadtax.entities;

import java.util.List;

public class VehicleTaxPaymentDTO {

    private Long vehicleId;
    private String make;
    private String model;
    private String licensePlate;
    private List<TaxPayment> taxPayments;

    public VehicleTaxPaymentDTO() {
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
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
