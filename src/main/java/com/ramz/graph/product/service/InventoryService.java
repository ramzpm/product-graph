package com.ramz.graph.product.service;


import com.ramz.graph.product.handler.ServiceHandler;
import com.ramz.graph.product.model.Inventory;
import com.ramz.graph.product.util.CommonHelper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;

@Service
@AllArgsConstructor
@Slf4j
public class InventoryService {

    ServiceHandler serviceHandler;

    CommonHelper helper;

    public Inventory getInventoryDetailsFromService(String id) {
       String urlString= "http://localhost:9000/ramz/api/product/inventory/"+id;
        try {
            String response = serviceHandler.callRestService(urlString);
            return  helper.convertStringToInventoryRespone(response);
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException(e);
        }
    }

}
