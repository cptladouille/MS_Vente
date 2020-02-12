package org.cnam.MS_Vente.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

    @ManyToMany(mappedBy = "catalogs")
    private Collection<ArticleModel> articles;

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

    public Collection<ArticleModel> getArticles() {
        return articles;
    }

    public void setArticles(Collection<ArticleModel> articles) {
        this.articles = articles;
    }
}
