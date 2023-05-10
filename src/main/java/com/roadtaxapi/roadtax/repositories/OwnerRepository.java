package com.roadtaxapi.roadtax.repositories;

import com.roadtaxapi.roadtax.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "owner", path="owner")
public interface OwnerRepository extends JpaRepository<Owner, Long>
{
}