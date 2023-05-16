package com.roadtax.repositories;

import com.roadtax.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "owner", path="owner")
public interface OwnerRepository extends JpaRepository<Owner, Integer>
{
}
