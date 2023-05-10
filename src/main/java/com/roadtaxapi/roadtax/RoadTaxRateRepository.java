package com.roadtaxapi.roadtax;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "rate", path="rate")
public interface RoadTaxRateRepository extends JpaRepository<RoadTaxRate, Integer>
{
}
