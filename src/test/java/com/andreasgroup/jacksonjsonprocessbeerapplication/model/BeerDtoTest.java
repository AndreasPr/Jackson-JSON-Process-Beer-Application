package com.andreasgroup.jacksonjsonprocessbeerapplication.model;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

/**
 * Created on 25/Oct/2020 to jackson-json-process-beer-application
 */
@JsonTest
class BeerDtoTest extends BaseTest{

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);
        System.out.println(jsonString);
    }

    @Test
    void testDeserialize() throws JsonProcessingException {
        String jsonData = "{\"id\":\"22f9674e-2dbf-47ca-b8ef-2437762bed1f\",\"beerName\":\"Test Beer\",\"beerStyle\":\"Ale\",\"upc\":1234645345,\"price\":19.89,\"createdDate\":\"2020-10-25T19:55:17.7431968-04:00\",\"lastUpdatedDate\":\"2020-10-25T19:55:17.7461964-04:00\"}";

        BeerDto beerDto = objectMapper.readValue(jsonData, BeerDto.class);
        System.out.println(beerDto);
    }
}
