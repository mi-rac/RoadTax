package com.roadtax.services;

import com.roadtax.controllers.VehicleRepository;
import com.roadtax.entities.Vehicle;
import com.roadtax.views.PaymentDTO;
import com.roadtax.views.VehiclePaymentsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VehiclePaymentsDTOService
{
    @Autowired
    private VehicleRepository vehicles;

    @Autowired
    private PaymentDTOService paymentDTOService;

    public VehiclePaymentsDTO convertToVehiclePaymentDTO(Vehicle vehicle) {
        VehiclePaymentsDTO vehiclePaymentsDTO = new VehiclePaymentsDTO();
        vehiclePaymentsDTO.setVehicleId(vehicle.getVehicleId());
        vehiclePaymentsDTO.setMake(vehicle.getMake());
        vehiclePaymentsDTO.setModel(vehicle.getModel());
        vehiclePaymentsDTO.setLicensePlate(vehicle.getLicensePlate());
        vehiclePaymentsDTO.setTaxed(vehicle.isVehicleTaxed());
        vehiclePaymentsDTO.setTaxedUntil(vehicle.getTaxedUntil());
        vehiclePaymentsDTO.setPayments(getAllPaymentsForVehicle(vehicle));
        return vehiclePaymentsDTO;
    }

    public List<VehiclePaymentsDTO> getAllVehiclePaymentsDTO() {
        return vehicles.findAll().stream().map(this::convertToVehiclePaymentDTO).collect(Collectors.toList());
    }

    public VehiclePaymentsDTO getVehiclePaymentsDTOById(Integer id) {
        Optional<Vehicle> vehicle = vehicles.findById(id);
        return vehicle.map(this::convertToVehiclePaymentDTO).orElse(null);
    }

    public List<PaymentDTO> getAllPaymentsForVehicle(Vehicle vehicle)
    {
        return vehicle.getPayments().stream().map(paymentDTOService::convertToPaymentDTO).collect(Collectors.toList());
    }
}
