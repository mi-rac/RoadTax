package com.roadtax.repositories;

import com.roadtax.entities.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
@EnableJpaRepositories(basePackages = "com.roadtax")
public class RepositoryConfig implements RepositoryRestConfigurer
{
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors)
    {
        config.exposeIdsFor(Owner.class);
        config.exposeIdsFor(RoadTaxRate.class);
        config.exposeIdsFor(TaxPayment.class);
        config.exposeIdsFor(Vehicle.class);
        config.exposeIdsFor(VehicleCategory.class);
        config.exposeIdsFor(VehicleCategoryRelation.class);
    }
}
