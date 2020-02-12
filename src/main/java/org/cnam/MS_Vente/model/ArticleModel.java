package org.cnam.MS_Vente.model;


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
import java.util.Collection;


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

    @ManyToMany
    @JoinTable(
        name = "ART_ORDER",
        joinColumns = @JoinColumn(name = "ID_ART"),
        inverseJoinColumns = @JoinColumn(name = "ID_ORDER_CLIENT"))
    private Collection<OrderModel> orders;

    @ManyToMany
    @JoinTable(
            name = "ART_CATALOG",
            joinColumns = @JoinColumn(name = "ID_ART"),
            inverseJoinColumns = @JoinColumn(name = "ID_CATALOG")
    )
    private Collection<CatalogModel> catalogs;

    @ManyToOne
    private PromotionModel promotion;

    @ManyToOne
    private CategoryModel category;

    public ArticleModel(String label, float priceEOT) {
        this.label = label;
        this.priceEOT = priceEOT;
    }

    public ArticleModel(Long id, String label, float priceEOT) {
        this.id = id;
        this.label = label;
        this.priceEOT = priceEOT;
    }

    public ArticleModel(Long id, String label, float priceEOT, Collection<OrderModel> orders, Collection<CatalogModel> catalogs, PromotionModel promotion, CategoryModel category) {
        this.id = id;
        this.label = label;
        this.priceEOT = priceEOT;
        this.orders = orders;
        this.catalogs = catalogs;
        this.promotion = promotion;
        this.category = category;
    }

    public ArticleModel( String label, float priceEOT, Collection<OrderModel> orders, Collection<CatalogModel> catalogs, PromotionModel promotion, CategoryModel category) {
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

    public Collection<OrderModel> getOrders() {
        return orders;
    }

    public void setOrders(Collection<OrderModel> orders) {
        this.orders = orders;
    }

    public Collection<CatalogModel> getCatalogs() {
        return catalogs;
    }

    public void setCatalogs(Collection<CatalogModel> catalogs) {
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
