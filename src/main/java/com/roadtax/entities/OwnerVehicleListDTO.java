package com.roadtax.entities;

import java.util.List;

public class OwnerVehicleListDTO
{
    private int ownerId;
    private String firstName;
    private String lastName;
    private String email;
    private List<VehicleShortDTO> vehicles;

    public OwnerVehicleListDTO() {
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<VehicleShortDTO> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<VehicleShortDTO> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        return "OwnerVehicleDTO{" +
                "ownerId=" + ownerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", vehicles=" + vehicles +
                '}';
    }
}
