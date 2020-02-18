package org.cnam.MS_Vente.dto;

import org.cnam.MS_Vente.domain.Article;
import org.cnam.MS_Vente.model.ArticleModel;

import java.util.Set;

public class OrderResponse {

    private Long id;
    private String orderNumber;
    private Boolean isPaid;
    private Long idClient;
    private Set<ArticleModel> articles;


    public OrderResponse(Long id, String orderNumber, Boolean isPaid, Long idClient, Set<ArticleModel> articles) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.isPaid = isPaid;
        this.idClient = idClient;
        this.articles = articles;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Boolean getPaid() {
        return isPaid;
    }

    public void setPaid(Boolean paid) {
        isPaid = paid;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public Set<ArticleModel> getArticles() {
        return articles;
    }

    public void setArticles(Set<ArticleModel> articles) {
        this.articles = articles;
    }
}
