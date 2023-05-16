package com.roadtax.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class TaxRate implements java.io.Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rateId;
    private Double taxRate;
    @ManyToOne
    @JoinColumn(name = "engine_type_id")
    private EngineType engineType;
    @ManyToOne
    @JoinColumn(name = "emission_band_id")
    private EmissionBand emissionBand;
    private Integer monthsCovered;
    private Boolean firstYear;
    private Boolean directDebit;
    @Temporal(TemporalType.DATE)
    private Date effectiveFrom;
    @Temporal(TemporalType.DATE)
    private Date effectiveTo;
    private Boolean richTax;

    public TaxRate() {
    }

    public Integer getRateId() {
        return rateId;
    }

    public void setRateId(Integer rateId) {
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

    public Integer getMonthsCovered() {
        return monthsCovered;
    }

    public void setMonthsCovered(Integer monthsCovered) {
        this.monthsCovered = monthsCovered;
    }

    public Boolean isFirstYear() {
        return firstYear;
    }

    public void setFirstYear(Boolean firstYear) {
        this.firstYear = firstYear;
    }

    public Boolean isDirectDebit() {
        return directDebit;
    }

    public void setDirectDebit(Boolean directDebit) {
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

    public Boolean isRichTax() {
        return richTax;
    }

    public void setRichTax(Boolean richTax) {
        this.richTax = richTax;
    }
}

