package com.roadtax.repositories;

import com.roadtax.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "emissionBand", path="emissionBand")
public interface EmissionBandRepository extends JpaRepository<Owner, Long>
{
}
