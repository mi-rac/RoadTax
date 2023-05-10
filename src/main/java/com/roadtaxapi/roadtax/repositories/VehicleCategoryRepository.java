package com.roadtaxapi.roadtax.repositories;

import com.roadtaxapi.roadtax.entities.VehicleCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "category", path="category")
public interface VehicleCategoryRepository extends JpaRepository<VehicleCategory, Long>
{
}
