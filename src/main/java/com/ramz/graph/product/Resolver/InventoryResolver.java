package com.ramz.graph.product.Resolver;

import com.ramz.graph.product.model.Inventory;
import com.ramz.graph.product.model.ProductDetails;
import com.ramz.graph.product.service.InventoryService;
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
public class InventoryResolver implements GraphQLResolver<ProductDetails> {

    private InventoryService service;

    public Inventory getInventoryResponse(ProductDetails details, DataFetchingEnvironment env) {
        Map<String, Object> contextValues = env.getExecutionStepInfo().getParent().getArguments();
        String id = contextValues.get("id").toString();
        System.out.println("Inve id"+id);
        Inventory inventoryResponse = service.getInventoryDetailsFromService(id);
        System.out.println(inventoryResponse);
        return inventoryResponse;
    }

}