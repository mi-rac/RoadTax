package com.roadtax.repositories;

import com.roadtax.entities.EngineType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "engineType", path="engineType")
public interface EngineTypeRepository extends JpaRepository<EngineType, Long>
{
}
