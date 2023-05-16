package com.roadtax.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class EmissionBand implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String band;
    private int co2lower;
    @Column(nullable = true)
    private int co2upper;
    @Column(nullable = true)
    private boolean after2017;

    @OneToMany(mappedBy = "emissionBand", cascade = CascadeType.ALL)
    private Set<Vehicle> vehicles;

    @OneToMany(mappedBy = "emissionBand", cascade = CascadeType.ALL)
    private Set<TaxRate> taxRates;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getCo2lower() {
        return co2lower;
    }

    public void setCo2lower(int co2lower) {
        this.co2lower = co2lower;
    }

    public int getCo2upper() {
        return co2upper;
    }

    public void setCo2upper(int co2upper) {
        this.co2upper = co2upper;
    }

    public boolean isAfter2017() {
        return after2017;
    }

    public void setAfter2017(boolean after2017) {
        this.after2017 = after2017;
    }

    public Set<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(Set<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public Set<TaxRate> getTaxRates() {
        return taxRates;
    }

    public void setTaxRates(Set<TaxRate> taxRates) {
        this.taxRates = taxRates;
    }
}
