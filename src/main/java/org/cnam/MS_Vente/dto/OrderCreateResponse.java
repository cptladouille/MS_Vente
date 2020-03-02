package org.cnam.MS_Vente.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.cnam.MS_Vente.model.ArticleModel;

import java.util.Set;

public class OrderCreateResponse {

    public Long id;
    public Long idClient;
    public String orderNumber;
    public Set<ArticleModel> articles;
    public boolean isPaid;

    @JsonCreator
    public OrderCreateResponse(@JsonProperty("id") Long id,
                                 @JsonProperty("idClient") Long idClient,
                                 @JsonProperty("orderNumber") String orderNumber,
                                @JsonProperty("isPaid") boolean isPaid,
                                @JsonProperty("articles") Set<ArticleModel> articles)
    {
        this.id = id;
        this.idClient= idClient;
        this.orderNumber= orderNumber;
        this.isPaid = isPaid;
        this.articles = articles;
    }

}
