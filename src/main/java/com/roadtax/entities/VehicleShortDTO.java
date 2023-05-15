package com.roadtax.entities;

public class VehicleShortDTO
{
    private int vehicleId;
    private String make;
    private String model;
    private String licensePlate;

    public VehicleShortDTO()
    {
    }

    public int getVehicleId()
    {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId)
    {
        this.vehicleId = vehicleId;
    }

    public String getMake()
    {
        return make;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getLicensePlate()
    {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate)
    {
        this.licensePlate = licensePlate;
    }
}
