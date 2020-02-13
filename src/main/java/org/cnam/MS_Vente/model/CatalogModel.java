package org.cnam.MS_Vente.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "Catalog")
public class CatalogModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Label")
    private String label;

    @ManyToMany
    @JoinTable(
            name = "ART_CATALOG",
            joinColumns = @JoinColumn(name = "ID_CATALOG"),
            inverseJoinColumns = @JoinColumn(name = "ID_ART")
    )
    @JsonManagedReference
    private Set<ArticleModel> articles;

    public CatalogModel() {
    }
    public CatalogModel(Long id) {
        this.id = id;
    }
    public CatalogModel(Long id, String label) {
        this.id = id;
        this.label = label;
    }

    public CatalogModel(Long id,String label, Set<ArticleModel> articles) {
        this.id = id;
        this.label = label;
        this.articles = articles;
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

    public Set<ArticleModel> getArticles() {
        return articles;
    }

    public void setArticles(Set<ArticleModel> articles) {
        this.articles = articles;
    }
}
