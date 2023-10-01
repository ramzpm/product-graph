package com.ramz.graph.product.Resolver;

import com.ramz.graph.product.model.Price;
import com.ramz.graph.product.model.ProductDetails;
import com.ramz.graph.product.service.PriceService;
import graphql.kickstart.tools.GraphQLResolver;
import graphql.schema.DataFetchingEnvironment;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;


/**
 * Resolver class for Product Details feature and method name should match with the schema query.
 */
@Component
@AllArgsConstructor
@Slf4j
public class PriceResolver implements GraphQLResolver<ProductDetails> {

    private PriceService service;

    public Price price(ProductDetails details, DataFetchingEnvironment env) {
        Map<String, Object> contextValues = env.getExecutionStepInfo().getParent().getArguments();
        String id = contextValues.get("id").toString();
        log.info("Invoking Price service for productId..." + id);
        return service.getPriceFromService(id);
    }
}