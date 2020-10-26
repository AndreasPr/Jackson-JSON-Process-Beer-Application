package com.andreasgroup.jacksonjsonprocessbeerapplication.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * Created on 25/Oct/2020 to jackson-json-process-beer-application
 */
@ActiveProfiles("kebab")
@JsonTest
public class BeerDtoKebabTest extends BaseTest {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testKebab() throws JsonProcessingException {

        BeerDto beerDto = getDto();

        String jsonData = objectMapper.writeValueAsString(beerDto);
        System.out.println(jsonData);
    }
}
