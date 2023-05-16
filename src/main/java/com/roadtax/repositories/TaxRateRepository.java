package com.roadtax.repositories;

import com.roadtax.entities.TaxRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "taxRate", path="taxRate")
public interface TaxRateRepository extends JpaRepository<TaxRate, Long>
{
}
