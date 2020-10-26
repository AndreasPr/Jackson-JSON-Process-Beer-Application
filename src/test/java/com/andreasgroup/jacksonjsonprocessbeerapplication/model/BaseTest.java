package com.andreasgroup.jacksonjsonprocessbeerapplication.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Created on 25/Oct/2020 to jackson-json-process-beer-application
 */
public class BaseTest {

    BeerDto getDto(){
        return BeerDto.builder()
                .beerName("Test Beer")
                .beerStyle("Ale")
                .id(UUID.randomUUID())
                .createdDate(OffsetDateTime.now())
                .lastUpdatedDate(OffsetDateTime.now())
                .price(new BigDecimal("19.89"))
                .localDate(LocalDate.now())
                .upc(1234645345L)
                .build();
    }

}
