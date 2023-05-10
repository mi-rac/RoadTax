package com.roadtaxapi.roadtax;

import javax.persistence.*;
import java.util.Date;

@Entity
public class RoadTaxRate implements java.io.Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rate_id;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private VehicleCategory vehicleCategory;

    private Double tax_rate;

    @Temporal(TemporalType.DATE)
    private Date effective_from;

    @Temporal(TemporalType.DATE)
    private Date effective_to;

    public RoadTaxRate() {
    }

    public Long getRate_id() {
        return rate_id;
    }

    public void setRate_id(Long rate_id) {
        this.rate_id = rate_id;
    }

    public VehicleCategory getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(VehicleCategory vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public Double getTax_rate() {
        return tax_rate;
    }

    public void setTax_rate(Double tax_rate) {
        this.tax_rate = tax_rate;
    }

    public Date getEffective_from() {
        return effective_from;
    }

    public void setEffective_from(Date effective_from) {
        this.effective_from = effective_from;
    }

    public Date getEffective_to() {
        return effective_to;
    }

    public void setEffective_to(Date effective_to) {
        this.effective_to = effective_to;
    }
}

