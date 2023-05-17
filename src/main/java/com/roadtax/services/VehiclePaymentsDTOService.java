package com.roadtax.services;

import com.roadtax.entities.Vehicle;
import com.roadtax.views.VehiclePaymentsDTO;
import org.springframework.stereotype.Service;

@Service
public class VehiclePaymentsDTOService
{
    public VehiclePaymentsDTO convertToVehicleShortDTO(Vehicle vehicle) {
        VehiclePaymentsDTO vehiclePaymentsDTO = new VehiclePaymentsDTO();
        vehiclePaymentsDTO.setVehicleId(vehicle.getVehicleId());
        vehiclePaymentsDTO.setMake(vehicle.getMake());
        vehiclePaymentsDTO.setModel(vehicle.getModel());
        vehiclePaymentsDTO.setLicensePlate(vehicle.getLicensePlate());
        vehiclePaymentsDTO.setTaxed(vehicle.isVehicleTaxed());
        vehiclePaymentsDTO.setTaxedUntil(vehicle.getTaxedUntil());
        return vehiclePaymentsDTO;
    }
}
