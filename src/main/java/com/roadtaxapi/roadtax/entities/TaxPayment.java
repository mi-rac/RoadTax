package com.roadtaxapi.roadtax.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class TaxPayment implements java.io.Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    @ManyToOne
    @JoinColumn(name = "vehicleId")
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "rateId")
    private RoadTaxRate roadTaxRate;

    @Temporal(TemporalType.DATE)
    private Date paymentDate;

    private Double paymentAmount;
    private String paymentStatus;

    public TaxPayment() {
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
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

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
