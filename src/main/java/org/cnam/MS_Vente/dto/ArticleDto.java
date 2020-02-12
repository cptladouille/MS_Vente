package org.cnam.MS_Vente.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class ArticleDto {

    public Long id;
    public String label;
    public int category;
    public float priceEOT;


    @JsonCreator
    public ArticleDto(
            @JsonProperty("id") Long id,
            @JsonProperty("data") String label,
            @JsonProperty("category") int category,
            @JsonProperty("priceEOT") float priceEOT){
        this.label = label;
        this.id = id;
        this.category = category;
        this.priceEOT = priceEOT;
    }

}
