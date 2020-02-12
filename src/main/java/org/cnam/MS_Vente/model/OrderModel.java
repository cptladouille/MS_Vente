package org.cnam.MS_Vente.model;

import javafx.beans.DefaultProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Collection;


@Entity
@Table(name = "Order_client")
public class OrderModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "orderNumber")
    private String orderNumber;

    @Column(name = "idClient")
    private Long idClient;

    @ManyToMany(mappedBy = "orders")
    private Collection<ArticleModel> articles;

    public OrderModel()
    {

    }

    public OrderModel(Long id, String orderNumber, Long idClient) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.idClient = idClient;
    }

    public OrderModel(String orderNumber, Long idClient) {
        this.orderNumber = orderNumber;
        this.idClient = idClient;
    }


    public OrderModel(Long id, String orderNumber, Long idClient, Collection<ArticleModel> articles) {
        this.id = id;
        this.orderNumber = orderNumber;
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

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public Collection<ArticleModel> getArticles() {
        return articles;
    }

    public void setArticles(Collection<ArticleModel> articles) {
        this.articles = articles;
    }
}
