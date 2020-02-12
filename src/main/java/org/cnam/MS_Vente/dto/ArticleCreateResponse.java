package org.cnam.MS_Vente.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ArticleCreateResponse {

    public Long id;
    public String label;
    public float priceEOT;

    @JsonCreator
    public ArticleCreateResponse(@JsonProperty("id") Long id,
                                 @JsonProperty("data") String label,
                                 @JsonProperty("priceEOT") float priceEOT)
    {
        this.id = id;
        this.label =label;
        this.priceEOT = priceEOT;
    }

}
