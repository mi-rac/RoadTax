package com.roadtax.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Vehicle implements java.io.Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleId;

    @ManyToOne
    @JoinColumn(name = "ownerId")
    private Owner owner;
    private String make;
    private String model;
    private Integer year;
    private String licensePlate;
    private String vinNumber;

    @Temporal(TemporalType.DATE)
    private Date registrationDate;

    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL)
    private Set<VehicleCategoryRelation> vehicleCategoryRelations;

    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL)
    private Set<TaxPayment> taxPayments;

    public Vehicle() {
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
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

    public Set<VehicleCategoryRelation> getVehicleCategoryRelations() {
        return vehicleCategoryRelations;
    }

    public void setVehicleCategoryRelations(Set<VehicleCategoryRelation> vehicleCategoryRelations) {
        this.vehicleCategoryRelations = vehicleCategoryRelations;
    }

    public Set<TaxPayment> getTaxPayments() {
        return taxPayments;
    }

    public void setTaxPayments(Set<TaxPayment> taxPayments) {
        this.taxPayments = taxPayments;
    }
}

