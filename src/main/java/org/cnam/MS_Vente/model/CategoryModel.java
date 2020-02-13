package org.cnam.MS_Vente.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "Category")
public class CategoryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Label")
    private String label;
/*
    @OneToMany(mappedBy = "category")
    @JsonBackReference
    private Set<ArticleModel> articles;*/

    @ManyToOne
    @JoinColumn
    private TaxeModel taxe;


    public CategoryModel() {
    }

    public CategoryModel(String label) {
        this.label = label;
    }
    public CategoryModel(Long id, String label) {
        this.id = id;
        this.label = label;
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
/*
    public Set<ArticleModel> getArticles() {
        return articles;
    }

    public void setArticles(Set<ArticleModel> articles) {
        this.articles = articles;
    }
*/
    public TaxeModel getTaxe() {
        return taxe;
    }

    public void setTaxe(TaxeModel taxe) {
        this.taxe = taxe;
    }
}
