package com.ramz.graph.product.Resolver;

import com.ramz.graph.product.model.ProductDetails;
import com.ramz.graph.product.model.Reviews;
import com.ramz.graph.product.service.ProductService;
import com.ramz.graph.product.service.ReviewsService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.schema.DataFetchingEnvironment;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


/**
 * Resolver class for Product Details feature and method name should match with the schema query.
 */
@Component
@AllArgsConstructor
@Slf4j
public class QueryResolver implements GraphQLQueryResolver {

    private ProductService productService;

    private ReviewsService reviewsService;


    public Reviews getReviews(String id) {
        Reviews reviewResponse = reviewsService.getReviewsFromService(id);
        return reviewResponse;
    }

    public ProductDetails getProductDetails(String id, DataFetchingEnvironment env) {
        ProductDetails productDetailsFromService = new ProductDetails();
        productDetailsFromService.setProduct(productService.getProductDetailsFromService(id));
        return productDetailsFromService;
    }

}