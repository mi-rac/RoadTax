package com.roadtaxapi.roadtax;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "vehicle_categories")
public class VehicleCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long category_id;
    private String category_name;
    private String category_description;

    @OneToMany(mappedBy = "vehicleCategory", cascade = CascadeType.ALL)
    private Set<VehicleCategoryRelation> vehicleCategoryRelations;

    @OneToMany(mappedBy = "vehicleCategory", cascade = CascadeType.ALL)
    private Set<RoadTaxRate> roadTaxRates;

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getCategory_description() {
        return category_description;
    }

    public void setCategory_description(String category_description) {
        this.category_description = category_description;
    }

    public Set<VehicleCategoryRelation> getVehicleCategoryRelations() {
        return vehicleCategoryRelations;
    }

    public void setVehicleCategoryRelations(Set<VehicleCategoryRelation> vehicleCategoryRelations) {
        this.vehicleCategoryRelations = vehicleCategoryRelations;
    }

    public Set<RoadTaxRate> getRoadTaxRates() {
        return roadTaxRates;
    }

    public void setRoadTaxRates(Set<RoadTaxRate> roadTaxRates) {
        this.roadTaxRates = roadTaxRates;
    }
}

