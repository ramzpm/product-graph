package com.ramz.graph.product.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndReview {
    String reviewId;
    Boolean isRecommended;
    Boolean isRatingsOnly;
    String userNickname;
    String reviewText;
    Float rating;
}