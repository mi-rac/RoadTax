package com.roadtax.repositories;

import com.roadtax.entities.OwnerVehicleListDTO;
import com.roadtax.services.OwnerVehicleListService;
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
public class OwnerVehicleListRepository
{
    @Autowired
    private OwnerVehicleListService ownerVehicleListService;

    @GetMapping("/owner/vehicleList")
    public List<OwnerVehicleListDTO> getAllOwnerVehicleLists()
    {
        return ownerVehicleListService.getAllOwnerVehicleListDTO();
    }

    @GetMapping("/owner/{id}/vehicleList")
    public OwnerVehicleListDTO getOwnerVehicleListByID(@PathVariable("id") Long id)
    {
        OwnerVehicleListDTO ownerVehicleList = ownerVehicleListService.getOwnerVehicleListDTOById(id);

        if(ownerVehicleList != null) {
            return ownerVehicleList;
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Student ID not found.");
    }
}
