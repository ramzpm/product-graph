package com.ramz.graph.product.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    String productId;
    String title;
    String brand;
    String description;
    String partnumber;
    String sizeGuide;
    String warrantyInformation;
    String deliveryMessage;
    String submissionTime;
    String id;
    List<Photo> photo;

}
