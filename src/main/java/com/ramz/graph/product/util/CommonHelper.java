package com.ramz.graph.product.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ramz.graph.product.model.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class CommonHelper {

    /**
     * Configuration attributes for response parsing.
     *
     * @param response object which is a string
     * @return converted object from string object
     * @throws JsonProcessingException if string is not complying with json structure
     */

    public Reviews convertStringToReviewsRespone(String response) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Reviews parsedObject = objectMapper.readValue(response, Reviews.class);
        return parsedObject;
    }
    public Price convertStringToPriceRespone(String response) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Price parsedObject = objectMapper.readValue(response, Price.class);
        return parsedObject;
    }

    public Inventory convertStringToInventoryRespone(String response) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Inventory parsedObject = objectMapper.readValue(response, Inventory.class);
        return parsedObject;
    }

    public Product convertStringToProductDetailsRespone(String response) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Product parsedObject = objectMapper.readValue(response, Product.class);
        return parsedObject;
    }
}
