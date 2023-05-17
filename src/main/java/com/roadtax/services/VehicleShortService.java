package com.roadtax.services;

import com.roadtax.entities.Vehicle;
import com.roadtax.views.VehicleShortDTO;
import org.springframework.stereotype.Service;

@Service
public class VehicleShortService
{
    public VehicleShortDTO convertToVehicleShortDTO(Vehicle vehicle) {
        VehicleShortDTO vehicleShortDTO = new VehicleShortDTO();
        vehicleShortDTO.setVehicleId(vehicle.getVehicleId());
        vehicleShortDTO.setMake(vehicle.getMake());
        vehicleShortDTO.setModel(vehicle.getModel());
        vehicleShortDTO.setLicensePlate(vehicle.getLicensePlate());
        vehicleShortDTO.setTaxed(vehicle.isVehicleTaxed());
        vehicleShortDTO.setTaxedUntil(vehicle.getTaxedUntil());
        return vehicleShortDTO;
    }
}
