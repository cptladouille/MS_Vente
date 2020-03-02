package org.cnam.MS_Vente.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.annotations.FilterJoinTable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Set;


@Entity
@Table(name = "Article")
public class ArticleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "label")
    private String label;

    @Column(name = "priceEOT")
    private float priceEOT;

    @ManyToMany(mappedBy = "articles")
    @JsonBackReference(value = "orders")
    private Set<OrderModel> orders;

    @ManyToMany(mappedBy = "articles")
    @JsonBackReference(value = "catalogs")
    private Set<CatalogModel> catalogs;

    @ManyToOne
    @JsonBackReference(value = "promotion")
    private PromotionModel promotion;

    @ManyToOne
    @JsonBackReference(value = "category")
    private CategoryModel category;

    public ArticleModel()
    {

    }

    public ArticleModel(String label, float priceEOT) {
        this.label = label;
        this.priceEOT = priceEOT;
    }

    public ArticleModel(Long id, String label, float priceEOT) {
        this.id = id;
        this.label = label;
        this.priceEOT = priceEOT;
    }

    public ArticleModel(Long id, String label, float priceEOT, Set<OrderModel> orders, Set<CatalogModel> catalogs, PromotionModel promotion, CategoryModel category) {
        this.id = id;
        this.label = label;
        this.priceEOT = priceEOT;
        this.orders = orders;
        this.catalogs = catalogs;
        this.promotion = promotion;
        this.category = category;
    }

    public ArticleModel( String label, float priceEOT, Set<OrderModel> orders, Set<CatalogModel> catalogs, PromotionModel promotion, CategoryModel category) {
        this.label = label;
        this.priceEOT = priceEOT;
        this.orders = orders;
        this.catalogs = catalogs;
        this.promotion = promotion;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public float getPriceEOT() {
        return priceEOT;
    }

    public void setPriceEOT(float priceEOT) {
        this.priceEOT = priceEOT;
    }

    public Set<OrderModel> getOrders() {
        return orders;
    }

    public void setOrders(Set<OrderModel> orders) {
        this.orders = orders;
    }

    public Set<CatalogModel> getCatalogs() {
        return catalogs;
    }

    public void setCatalogs(Set<CatalogModel> catalogs) {
        this.catalogs = catalogs;
    }

    public PromotionModel getPromotion() {
        return promotion;
    }

    public void setPromotion(PromotionModel promotion) {
        this.promotion = promotion;
    }

    public CategoryModel getCategory() {
        return category;
    }

    public void setCategory(CategoryModel category) {
        this.category = category;
    }
}
