package com.roadtax.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class EngineType implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;

    @OneToMany(mappedBy = "engineType", cascade = CascadeType.ALL)
    private Set<Vehicle> vehicles;

    @OneToMany(mappedBy = "engineType", cascade = CascadeType.ALL)
    private Set<TaxRate> taxRates;

    public EngineType() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
