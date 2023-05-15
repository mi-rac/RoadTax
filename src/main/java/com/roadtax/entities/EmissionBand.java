package com.roadtax.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class EmissionBand implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String band;
    private int co2Lower;
    private int co2Upper;

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

    public int getCo2Lower() {
        return co2Lower;
    }

    public void setCo2Lower(int co2Lower) {
        this.co2Lower = co2Lower;
    }

    public int getCo2Upper() {
        return co2Upper;
    }

    public void setCo2Upper(int co2Upper) {
        this.co2Upper = co2Upper;
    }
}
