package com.ramz.graph.product.handler;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Handler class to invoke external Bazaarvoice api.
 */
@Component
@RequiredArgsConstructor
@Slf4j
public class ServiceHandler {

    private final RestTemplate restTemplate;

    /**
     * @param uriString of external API
     * @return response as string from API
     * @throws URISyntaxException when URI is not valid
     */
    public String callRestService(String uriString) throws URISyntaxException {
        URI uri = new URI(uriString);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<String> responseEntity = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
        return responseEntity.getBody();
    }
}