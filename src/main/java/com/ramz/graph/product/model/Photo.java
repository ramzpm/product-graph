package com.ramz.graph.product.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Photo {
    String logoImageUrl;
    String photoId;
    String client;
    String name;
}
