package com.roadtax;

import com.roadtax.controllers.PaymentRepository;
import com.roadtax.services.TaxService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.sql.Date;

@EnableSwagger2
@SpringBootApplication
public class RoadTaxApplication
{
    @Autowired
    TaxService taxService;

    private static final Logger log = LoggerFactory.getLogger(RoadTaxApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(RoadTaxApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(PaymentRepository repository) {
        return args -> {
            repository.save(taxService.newPayment(1, 1, Date.valueOf("2022-11-25"), "Paid"));
            repository.save(taxService.newPayment(1, 1, Date.valueOf("2021-11-25"), "Paid"));
        };
    }
}
