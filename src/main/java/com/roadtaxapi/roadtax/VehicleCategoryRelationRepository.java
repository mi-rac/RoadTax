package com.roadtaxapi.roadtax;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "vehicleCategory", path="vehicleCategory")
public interface VehicleCategoryRelationRepository extends JpaRepository<VehicleCategoryRelation, Long>
{
}
