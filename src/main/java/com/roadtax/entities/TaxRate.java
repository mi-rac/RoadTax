package com.roadtax.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class TaxRate implements java.io.Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rateId;

    private Double taxRate;

    @ManyToOne
    @JoinColumn(name = "engine_type_id")
    private EngineType engineType;

    @ManyToOne
    @JoinColumn(name = "emission_band_id")
    private EmissionBand emissionBand;

    private int monthsCovered;

    @Column(nullable = true)
    private boolean firstYear;

    @Column(nullable = true)
    private boolean directDebit;

    @Temporal(TemporalType.DATE)
    private Date effectiveFrom;

    @Column(nullable = true)
    @Temporal(TemporalType.DATE)
    private Date effectiveTo;

    @Column(nullable = true)
    private boolean richTax;

    public TaxRate() {
    }

    public int getRateId() {
        return rateId;
    }

    public void setRateId(int rateId) {
        this.rateId = rateId;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public EmissionBand getEmissionBand() {
        return emissionBand;
    }

    public void setEmissionBand(EmissionBand emissionBand) {
        this.emissionBand = emissionBand;
    }

    public int getMonthsCovered() {
        return monthsCovered;
    }

    public void setMonthsCovered(int monthsCovered) {
        this.monthsCovered = monthsCovered;
    }

    public boolean isFirstYear() {
        return firstYear;
    }

    public void setFirstYear(boolean firstYear) {
        this.firstYear = firstYear;
    }

    public boolean isDirectDebit() {
        return directDebit;
    }

    public void setDirectDebit(boolean directDebit) {
        this.directDebit = directDebit;
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

    public boolean isRichTax() {
        return richTax;
    }

    public void setRichTax(boolean richTax) {
        this.richTax = richTax;
    }
}

