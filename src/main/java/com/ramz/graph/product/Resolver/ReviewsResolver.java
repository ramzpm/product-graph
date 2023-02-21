package com.ramz.graph.product.Resolver;

import com.ramz.graph.product.model.ProductDetails;
import com.ramz.graph.product.model.Reviews;
import com.ramz.graph.product.service.ReviewsService;
import graphql.kickstart.tools.GraphQLResolver;
import graphql.schema.DataFetchingEnvironment;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;


/**
 * Resolver class for Product Details feature and method name should match with the schema query.
 */
@Component
@AllArgsConstructor
@Slf4j
public class ReviewsResolver implements GraphQLResolver<ProductDetails> {

    private ReviewsService service;

    public CompletableFuture<Reviews> getReviewsResponse(ProductDetails details, DataFetchingEnvironment env) {
        Map<String, Object> contextValues = env.getExecutionStepInfo().getParent().getArguments();
        String id = contextValues.get("id").toString();
        CompletableFuture<Reviews> reviewsResponse = CompletableFuture.supplyAsync(() ->
                service.getReviewsFromService(id));
        return reviewsResponse;
    }

}