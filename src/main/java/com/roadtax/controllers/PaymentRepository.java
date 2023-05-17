package com.roadtax.controllers;

import com.roadtax.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "payment", path="payment")
public interface PaymentRepository extends JpaRepository<Payment, Integer>
{
}
