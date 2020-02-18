package org.cnam.MS_Vente.domain;

import org.cnam.MS_Vente.model.ArticleModel;

import java.util.Set;

public class Order {

    public Long id;
    public String orderNumber;
    public Long idClient;
    public Boolean isPaid;
    public Set<ArticleModel> articles;

    public Order(Long id, String orderNumber, Long idClient, Boolean isPaid) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.idClient = idClient;
        this.isPaid = isPaid;
    }
    public Order(Long id, String orderNumber, Long idClient, Boolean isPaid, Set<ArticleModel> articles) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.idClient = idClient;
        this.isPaid = isPaid;
        this.articles = articles;
    }

    public Order()
    {

    }
}
