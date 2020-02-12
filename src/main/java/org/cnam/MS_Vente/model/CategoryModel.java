package org.cnam.MS_Vente.model;


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

@Entity
@Table(name = "Category")
public class CategoryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Label")
    private String label;

    @OneToMany(mappedBy = "category")
    private Collection<ArticleModel> articles;

    @ManyToOne
    @JoinColumn
    private TaxeModel taxe;


    public CategoryModel() {
    }

    public CategoryModel(String label) {
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

    public Collection<ArticleModel> getArticles() {
        return articles;
    }

    public void setArticles(Collection<ArticleModel> articles) {
        this.articles = articles;
    }

    public TaxeModel getTaxe() {
        return taxe;
    }

    public void setTaxe(TaxeModel taxe) {
        this.taxe = taxe;
    }
}
