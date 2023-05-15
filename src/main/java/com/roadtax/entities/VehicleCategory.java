package com.roadtax.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class VehicleCategory implements java.io.Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;
    private String engineType;
    private String emissions;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private Set<Vehicle> vehicles;

    @OneToMany(mappedBy = "vehicleCategory", cascade = CascadeType.ALL)
    private Set<TaxRate> taxRates;

    public VehicleCategory() {
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getEmissions() {
        return emissions;
    }

    public void setEmissions(String emissions) {
        this.emissions = emissions;
    }

    public Set<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(Set<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public Set<TaxRate> getRoadTaxRates() {
        return taxRates;
    }

    public void setRoadTaxRates(Set<TaxRate> taxRates) {
        this.taxRates = taxRates;
    }
}

