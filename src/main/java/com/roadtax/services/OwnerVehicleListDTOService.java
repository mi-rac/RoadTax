package com.roadtax.services;

import com.roadtax.entities.Owner;
import com.roadtax.views.OwnerVehicleListDTO;
import com.roadtax.controllers.OwnerRepository;
import com.roadtax.views.VehiclePaymentsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OwnerVehicleListDTOService
{
    @Autowired
    private OwnerRepository owners;

    @Autowired
    private VehiclePaymentsDTOService vehiclePaymentsDTOService;

    public OwnerVehicleListDTO convertToOwnerVehicleDTO(Owner owner)
    {
        OwnerVehicleListDTO ownerVehicle = new OwnerVehicleListDTO();
        ownerVehicle.setOwnerId(owner.getOwnerId());
        ownerVehicle.setFirstName(owner.getFirstName());
        ownerVehicle.setLastName(owner.getLastName());
        ownerVehicle.setEmail(owner.getEmail());
        ownerVehicle.setVehicles(getAllVehiclesBelongingTo(owner));
        return ownerVehicle;
    }

    public List<OwnerVehicleListDTO> getAllOwnerVehicleListDTO() {
        return owners.findAll().stream().map(this::convertToOwnerVehicleDTO).collect(Collectors.toList());
    }

    public OwnerVehicleListDTO getOwnerVehicleListDTOById(Integer id)
    {
        Optional<Owner> owner = owners.findById(id);
        return owner.map(this::convertToOwnerVehicleDTO).orElse(null);
    }

    public List<VehiclePaymentsDTO> getAllVehiclesBelongingTo(Owner owner)
    {
        return owner.getVehicles().stream().map(vehiclePaymentsDTOService::convertToVehiclePaymentDTO).collect(Collectors.toList());
    }
}