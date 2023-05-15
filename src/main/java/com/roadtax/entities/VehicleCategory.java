package com.roadtax.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class VehicleCategory implements java.io.Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;
    private String categoryName;
    private String categoryDescription;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private Set<Vehicle> vehicles;

    @OneToMany(mappedBy = "vehicleCategory", cascade = CascadeType.ALL)
    private Set<RoadTaxRate> roadTaxRates;

    public VehicleCategory() {
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public Set<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(Set<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public Set<RoadTaxRate> getRoadTaxRates() {
        return roadTaxRates;
    }

    public void setRoadTaxRates(Set<RoadTaxRate> roadTaxRates) {
        this.roadTaxRates = roadTaxRates;
    }
}

