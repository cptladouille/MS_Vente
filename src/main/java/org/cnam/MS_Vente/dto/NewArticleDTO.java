package org.cnam.MS_Vente.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NewArticleDTO {

    private String label;

    @JsonCreator
    public NewArticleDTO(
            @JsonProperty("label") String label,
            @JsonProperty("priceEOT") float priceEOT){
    }
}
