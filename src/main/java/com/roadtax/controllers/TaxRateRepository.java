package com.roadtax.controllers;

import com.roadtax.entities.EmissionBand;
import com.roadtax.entities.EngineType;
import com.roadtax.entities.TaxRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;

@RepositoryRestResource(collectionResourceRel = "taxRate", path="taxRate")
public interface TaxRateRepository extends JpaRepository<TaxRate, Integer>
{
    @Query("SELECT e FROM EmissionBand e WHERE e.after2017 = :after2017 AND e.co2lower <= :emissions AND e.co2upper > :emissions")
    EmissionBand findByAfter2017AndEmissionsRange(@Param("after2017") Boolean after2017, @Param("emissions") Double emissions);

    @Query("SELECT t FROM TaxRate t WHERE " +
            "t.directDebit = :directDebit AND " +
            "t.effectiveFrom <= :registrationDate AND " +
            "t.effectiveTo > :registrationDate AND " +
            "t.monthsCovered = :duration AND " +
            "t.firstYear = :firstYear AND " +
            "t.richTax = :richTax AND " +
            "t.emissionBand = :emissionBandId AND " +
            "t.engineType = :engineTypeId")
    TaxRate findTaxRates(@Param("directDebit") Boolean directDebit,
                         @Param("registrationDate") Date registrationDate,
                         @Param("firstYear") Boolean firstYear,
                         @Param("richTax") Boolean richTax,
                         @Param("emissionBandId") Integer emissionBandId,
                         @Param("engineTypeId") Integer engineTypeId,
                         @Param("duration") Integer duration);
}
