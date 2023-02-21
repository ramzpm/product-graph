package com.ramz.graph.product.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Price {
    String productId;
    Float offerPrice;
    Float salePrice;
    String saleText;
    String offerText;

}
