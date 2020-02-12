package org.cnam.MS_Vente.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.cnam.MS_Vente.domain.Promotion;

public class CreateArticleRequest {
    public String Label;
    public float PriceEOT;
    public Long promotion_id;
    public Long category_id;

    @JsonCreator
    public CreateArticleRequest(
            @JsonProperty("Label") String Label,
            @JsonProperty("PriceEOT") float PriceEOT,
            @JsonProperty("PROMOTION_ID") Long promotion_id,
            @JsonProperty("CATEGORY_ID") Long category_id
            )
    {
        this.Label = Label;
        this.PriceEOT = PriceEOT;
        this.promotion_id = promotion_id;
        this.category_id = category_id;
    }


}
