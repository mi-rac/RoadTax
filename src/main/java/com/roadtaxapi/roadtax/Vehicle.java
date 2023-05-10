package com.roadtaxapi.roadtax;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "vehicles")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicle_id;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    private String make;
    private String model;
    private Integer year;
    private String license_plate;
    private String vin_number;

    @Temporal(TemporalType.DATE)
    private Date registration_date;

    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL)
    private Set<VehicleCategoryRelation> vehicleCategoryRelations;

    @OneToMany(mappedBy = "taxPayment", cascade = CascadeType.ALL)
    private Set<TaxPayment> taxPayments;

    public Vehicle() {
    }

    public Long getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(Long vehicle_id) {
        this.vehicle_id = vehicle_id;
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

    public String getLicense_plate() {
        return license_plate;
    }

    public void setLicense_plate(String license_plate) {
        this.license_plate = license_plate;
    }

    public String getVin_number() {
        return vin_number;
    }

    public void setVin_number(String vin_number) {
        this.vin_number = vin_number;
    }

    public Date getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(Date registration_date) {
        this.registration_date = registration_date;
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

