package com.roadtax.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Vehicle implements java.io.Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vehicleId;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;
    private String make;
    private String model;
    private Integer year;
    private String licensePlate;
    private String vinNumber;
    @Temporal(TemporalType.DATE)
    private Date registrationDate;
    @ManyToOne
    @JoinColumn(name = "engine_type_id")
    private EngineType engineType;
    private Double emissions;
    private Double listingPrice;
    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL)
    private Set<Payment> payments;

    public Vehicle() {
    }
    public Boolean isVehicleTaxed()
    {
        return this.getTaxPayments().stream().anyMatch(payment -> payment.getValidUntil().after(new java.util.Date()));
    }

    public Date getTaxedUntil()
    {
        // return the date corresponding to the latest value in the "validUntil" field of the TaxPayment objects
        return this.getTaxPayments().stream().map(Payment::getValidUntil).max(Date::compareTo).orElse(null);
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public Double getEmissions() {
        return emissions;
    }

    public void setEmissions(Double emissions) {
        this.emissions = emissions;
    }

    public Set<Payment> getTaxPayments() {
        return payments;
    }

    public void setTaxPayments(Set<Payment> payments) {
        this.payments = payments;
    }

    public Double getListingPrice() {
        return listingPrice;
    }

    public void setListingPrice(Double listingPrice) {
        this.listingPrice = listingPrice;
    }
}

