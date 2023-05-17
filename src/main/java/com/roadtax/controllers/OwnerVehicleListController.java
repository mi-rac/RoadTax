package com.roadtax.controllers;

import com.roadtax.views.OwnerVehicleListDTO;
import com.roadtax.services.OwnerVehicleListDTOService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@Api(tags = "DTO")
public class OwnerVehicleListController
{
    @Autowired
    private OwnerVehicleListDTOService ownerVehicleListDTOService;

    @GetMapping("/owner/vehicleList")
    public List<OwnerVehicleListDTO> getAllOwnerVehicleLists()
    {
        return ownerVehicleListDTOService.getAllOwnerVehicleListDTO();
    }

    @GetMapping("/owner/{id}/vehicleList")
    public OwnerVehicleListDTO getOwnerVehicleListByID(@PathVariable("id") Integer id)
    {
        OwnerVehicleListDTO ownerVehicleList = ownerVehicleListDTOService.getOwnerVehicleListDTOById(id);

        if(ownerVehicleList != null) {
            return ownerVehicleList;
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Student ID not found.");
    }
}
