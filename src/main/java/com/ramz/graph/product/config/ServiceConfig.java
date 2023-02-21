package com.ramz.graph.product.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
@Data
@AllArgsConstructor
public class ServiceConfig {


    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {

        Duration CONNECT_TIMEOUT = Duration.ofSeconds(5L);
        Duration READ_TIMEOUT = Duration.ofSeconds(5L);
        return builder.setConnectTimeout(CONNECT_TIMEOUT)
                .setReadTimeout(READ_TIMEOUT).build();
    }
}
