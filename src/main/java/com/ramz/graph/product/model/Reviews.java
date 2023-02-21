package com.ramz.graph.product.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reviews implements Serializable {

    String productId;
    Set<IndReview> indReviews;
    Integer totalFeedbackCount;
    Integer positiveFeedbackCount;
    Integer negativeFeedbackCount;

}
