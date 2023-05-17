package com.roadtax;

import com.roadtax.controllers.PaymentRepository;
import com.roadtax.services.PaymentDTOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class RoadTaxApplication
{
    @Autowired
    PaymentDTOService taxService;

    private static final Logger log = LoggerFactory.getLogger(RoadTaxApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(RoadTaxApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(PaymentRepository repository) {
        return args -> {
            repository.save(taxService.newPayment(1, 1, "2022-11-25", "paid"));
            repository.save(taxService.newPayment(1, 1, "2021-11-25", "paid"));
        };
    }
}
