package com.roadtax.services;

import com.roadtax.entities.Owner;
import com.roadtax.entities.Vehicle;
import com.roadtax.entities.VehicleShortDTO;
import com.roadtax.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VehicleShortService
{
    @Autowired
    private VehicleRepository vehicles;

    private VehicleShortDTO convertToVehicleShortDTO(Vehicle vehicle) {
        VehicleShortDTO vehicleShortDTO = new VehicleShortDTO();
        vehicleShortDTO.setVehicleId(vehicle.getVehicleId());
        vehicleShortDTO.setMake(vehicle.getMake());
        vehicleShortDTO.setModel(vehicle.getModel());
        vehicleShortDTO.setLicensePlate(vehicle.getLicensePlate());
        return vehicleShortDTO;
    }

    public List<VehicleShortDTO> getAllVehiclesBelongingTo(Owner owner)
    {
        return owner.getVehicles().stream().map(this::convertToVehicleShortDTO).collect(Collectors.toList());
    }
}
