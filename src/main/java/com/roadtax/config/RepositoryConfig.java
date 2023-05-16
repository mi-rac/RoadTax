package com.roadtax.config;

import com.roadtax.entities.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer
{
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors)
    {
        // expose id's for all entities
        config.exposeIdsFor(EmissionBand.class);
        config.exposeIdsFor(EngineType.class);
        config.exposeIdsFor(Owner.class);
        config.exposeIdsFor(OwnerVehicleListDTO.class);
        config.exposeIdsFor(TaxPayment.class);
        config.exposeIdsFor(TaxRate.class);
        config.exposeIdsFor(Vehicle.class);
    }
}
