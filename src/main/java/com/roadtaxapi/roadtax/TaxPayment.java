package com.roadtaxapi.roadtax;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tax_payments")
public class TaxPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long payment_id;

    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "rate_id")
    private RoadTaxRate roadTaxRate;

    @Temporal(TemporalType.DATE)
    private Date payment_date;

    private Double payment_amount;
    private String payment_status;

    public Long getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(Long payment_id) {
        this.payment_id = payment_id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public RoadTaxRate getRoadTaxRate() {
        return roadTaxRate;
    }

    public void setRoadTaxRate(RoadTaxRate roadTaxRate) {
        this.roadTaxRate = roadTaxRate;
    }

    public Date getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(Date payment_date) {
        this.payment_date = payment_date;
    }

    public Double getPayment_amount() {
        return payment_amount;
    }

    public void setPayment_amount(Double payment_amount) {
        this.payment_amount = payment_amount;
    }

    public String getPayment_status() {
        return payment_status;
    }

    public void setPayment_status(String payment_status) {
        this.payment_status = payment_status;
    }
}
