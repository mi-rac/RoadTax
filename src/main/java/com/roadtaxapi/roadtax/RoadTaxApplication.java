package com.roadtaxapi.roadtax;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
public class RoadTaxApplication
{

    public static void main(String[] args) {
        SpringApplication.run(RoadTaxApplication.class, args);
    }

}
