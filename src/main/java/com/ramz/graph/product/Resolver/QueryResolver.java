package com.ramz.graph.product.Resolver;

import com.ramz.graph.product.model.Product;
import com.ramz.graph.product.model.ProductDetails;
import com.ramz.graph.product.service.ProductService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.schema.DataFetchingEnvironment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URISyntaxException;


/**
 * Resolver class for Product Details feature and method name should match with the schema query.
 */
@Component
@Slf4j
public class QueryResolver implements GraphQLQueryResolver {

    @Autowired
    private ProductService productService;

    public ProductDetails getProductDetails(String id, DataFetchingEnvironment env) throws URISyntaxException {
        ProductDetails productDetailsFromService = new ProductDetails();
        Product p = productService.getProductDetailsFromService(id);
        productDetailsFromService.setProduct(p);
        return productDetailsFromService;
    }

}