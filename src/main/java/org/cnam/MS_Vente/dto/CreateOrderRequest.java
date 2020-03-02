package org.cnam.MS_Vente.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.cnam.MS_Vente.domain.Article;
import org.cnam.MS_Vente.model.ArticleModel;

import java.util.Set;

public class CreateOrderRequest {

    public Long idClient;
    public Set<ArticleModel> articles;
    @JsonCreator
    public CreateOrderRequest(
            @JsonProperty("idClient") Long idClient,
            @JsonProperty("articles")Set<ArticleModel> articles
            )
    {
        this.idClient = idClient;
        this.articles = articles;
    }


}
