package com.ramz.graph.product.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetails {

    Product product;
    Reviews reviews;
    Price price;
    Inventory inventory;

}
