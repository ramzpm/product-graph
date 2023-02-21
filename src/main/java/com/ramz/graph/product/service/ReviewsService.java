package com.ramz.graph.product.service;


import com.ramz.graph.product.handler.ServiceHandler;
import com.ramz.graph.product.model.Reviews;
import com.ramz.graph.product.util.CommonHelper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;

@Service
@AllArgsConstructor
@Slf4j
public class ReviewsService {

    ServiceHandler serviceHandler;

    CommonHelper helper;

    public Reviews getReviewsFromService(String id) {
        String urlString= "http://localhost:9000/ramz/api/product/reviews/"+id;
        try {
            String response = serviceHandler.callRestService(urlString);
            return helper.convertStringToReviewsRespone(response);
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
