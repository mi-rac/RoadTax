package com.roadtax.controllers;

import com.roadtax.entities.EmissionBand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "emissionBand", path="emissionBand")
public interface EmissionBandRepository extends JpaRepository<EmissionBand, Integer>
{
}
