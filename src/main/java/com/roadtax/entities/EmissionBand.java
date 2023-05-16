package com.roadtax.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class EmissionBand implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String band;
    private Integer co2lower;
    private Integer co2upper;
    private Boolean after2017;
    @OneToMany(mappedBy = "emissionBand", cascade = CascadeType.ALL)
    private Set<TaxRate> taxRates;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EmissionBand() {
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public Integer getCo2lower() {
        return co2lower;
    }

    public void setCo2lower(Integer co2lower) {
        this.co2lower = co2lower;
    }

    public Integer getCo2upper() {
        return co2upper;
    }

    public void setCo2upper(Integer co2upper) {
        this.co2upper = co2upper;
    }

    public Boolean isAfter2017() {
        return after2017;
    }

    public void setAfter2017(Boolean after2017) {
        this.after2017 = after2017;
    }

    public Set<TaxRate> getTaxRates() {
        return taxRates;
    }

    public void setTaxRates(Set<TaxRate> taxRates) {
        this.taxRates = taxRates;
    }
}
