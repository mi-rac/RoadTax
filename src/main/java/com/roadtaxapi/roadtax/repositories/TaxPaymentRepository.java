package com.roadtaxapi.roadtax.repositories;

import com.roadtaxapi.roadtax.entities.TaxPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "taxPayment", path="taxPayment")
public interface TaxPaymentRepository extends JpaRepository<TaxPayment, Long>
{
}
