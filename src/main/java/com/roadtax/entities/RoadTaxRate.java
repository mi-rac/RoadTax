package com.roadtax.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class RoadTaxRate implements java.io.Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rateId;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private VehicleCategory vehicleCategory;

    private Double taxRate;

    @Temporal(TemporalType.DATE)
    private Date effectiveFrom;

    @Temporal(TemporalType.DATE)
    private Date effectiveTo;

    public RoadTaxRate() {
    }

    public Long getRateId() {
        return rateId;
    }

    public void setRateId(Long rateId) {
        this.rateId = rateId;
    }

    public VehicleCategory getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(VehicleCategory vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public Date getEffectiveFrom() {
        return effectiveFrom;
    }

    public void setEffectiveFrom(Date effectiveFrom) {
        this.effectiveFrom = effectiveFrom;
    }

    public Date getEffectiveTo() {
        return effectiveTo;
    }

    public void setEffectiveTo(Date effectiveTo) {
        this.effectiveTo = effectiveTo;
    }
}

