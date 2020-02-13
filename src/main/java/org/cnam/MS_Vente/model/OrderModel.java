package org.cnam.MS_Vente.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import javafx.beans.DefaultProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Collection;
import java.util.Set;


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

    @ManyToMany
    @JoinTable(
            name = "ART_ORDER",
            joinColumns = @JoinColumn(name = "ID_ORDER_CLIENT"),
            inverseJoinColumns = @JoinColumn(name = "ID_ART"))
    @JsonManagedReference
    private Set<ArticleModel> articles;

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


    public OrderModel(Long id, String orderNumber, Long idClient, Set<ArticleModel> articles) {
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

    public Set<ArticleModel> getArticles() {
        return articles;
    }

    public void setArticles(Set<ArticleModel> articles) {
        this.articles = articles;
    }
}
