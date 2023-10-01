package com.ramz.graph.product.Resolver;

import com.ramz.graph.product.model.ProductDetails;
import com.ramz.graph.product.model.Reviews;
import com.ramz.graph.product.service.ReviewsService;
import graphql.kickstart.tools.GraphQLResolver;
import graphql.schema.DataFetchingEnvironment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;


/**
 * Resolver class for Product Details feature and method name should match with the schema query.
 */
@Component
@Slf4j
public class ReviewsResolver implements GraphQLResolver<ProductDetails> {

    @Autowired
    private ReviewsService service;

    public Reviews reviews(ProductDetails details, DataFetchingEnvironment env) {
        Map<String, Object> contextValues = env.getExecutionStepInfo().getParent().getArguments();
        String id = contextValues.get("id").toString();
        log.info("Invoking Reviews service for productId..." + id);
        return service.getReviewsFromService(id);
    }

}